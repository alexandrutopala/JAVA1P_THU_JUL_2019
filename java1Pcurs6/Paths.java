public final class Paths {
    private Paths() {
    }
    
    public static enum OS {
        
        WINDOWS, LINUX
    }
    
    public static Path get(OS os) {
        
        switch (os) {
            case WINDOWS: return new WindowsPath();
            case LINUX: return new LinuxPath();
            default: throw new IllegalArgumentException("Not supported");
        }
    }
    
    private static class WindowsPath implements Path {
        @Override
        public String getRoot() {
            return "C:\\";
        }
    }
    
    private static class LinuxPath implements Path {
        @Override
        public String getRoot() {
            return "/";
        }
        
        
    }
}