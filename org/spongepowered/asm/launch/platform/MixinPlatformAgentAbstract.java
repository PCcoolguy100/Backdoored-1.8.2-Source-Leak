package org.spongepowered.asm.launch.platform;

import java.net.*;
import java.io.*;
import org.apache.logging.log4j.*;

public abstract class MixinPlatformAgentAbstract implements IMixinPlatformAgent
{
    protected static final Logger logger;
    protected final MixinPlatformManager manager;
    protected final URI uri;
    protected final File container;
    protected final MainAttributes attributes;
    
    public MixinPlatformAgentAbstract(final MixinPlatformManager a1, final URI a2) {
        super();
        this.manager = a1;
        this.uri = a2;
        this.container = ((this.uri != null) ? new File(this.uri) : null);
        this.attributes = MainAttributes.of(a2);
    }
    
    @Override
    public String toString() {
        return String.format("PlatformAgent[%s:%s]", this.getClass().getSimpleName(), this.uri);
    }
    
    @Override
    public String getPhaseProvider() {
        return null;
    }
    
    static {
        logger = LogManager.getLogger("mixin");
    }
}
