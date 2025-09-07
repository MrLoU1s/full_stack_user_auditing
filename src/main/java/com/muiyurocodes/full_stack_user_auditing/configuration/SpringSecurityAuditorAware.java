package com.muiyurocodes.full_stack_user_auditing.configuration;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class SpringSecurityAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Always return a static value (e.g., "system")
        return Optional.of("system");
    }
}