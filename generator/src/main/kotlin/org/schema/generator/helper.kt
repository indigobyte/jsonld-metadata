package org.schema.generator

object helper {
    private val JAVA_KEYWORDS: Set<String> =
        """
        abstract 
        continue 
        for 
        new 
        switch
        assert 
        default 
        goto 
        package 
        synchronized
        boolean 
        do 
        if 
        private 
        this
        break 
        double 
        implements 
        protected 
        throw
        byte 
        else 
        import 
        public 
        throws
        case 
        enum 
        instanceof 
        return 
        transient
        catch 
        extends 
        int 
        short 
        try
        char 
        final 
        interface 
        static 
        void
        class 
        finally 
        long 
        strictfp 
        volatile
        const 
        float 
        native 
        super 
        while
        """
            .split("\n")
            .map(String::trim)
            .toSet()

    fun sanitizeIdentifier(name: String): String = when {
        JAVA_KEYWORDS.contains(name) -> "_$name"
        name.get(0).isDigit() -> "_$name"
        else -> name
    }
}
