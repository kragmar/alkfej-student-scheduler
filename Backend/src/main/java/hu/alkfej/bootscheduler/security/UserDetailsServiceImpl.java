package hu.alkfej.bootscheduler.security;

import hu.alkfej.bootscheduler.entities.Teacher;
import hu.alkfej.bootscheduler.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private AuthenticatedUser authenticatedUser;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Teacher> oTeacher = teacherRepository.findByUsername(username);
        if (!oTeacher.isPresent()) {
            throw new UsernameNotFoundException(username);
        }
        Teacher teacher = oTeacher.get();
        authenticatedUser.setTeacher(teacher);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(teacher.getRole().toString()));

        return new org.springframework.security.core.userdetails.User(teacher.getUsername(), teacher.getPassword(), grantedAuthorities);
    }
}
