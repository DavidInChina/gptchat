package livekit.org.webrtc;

/* loaded from: classes2.dex */
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    /* loaded from: classes2.dex */
    public static class DefaultLoader implements NativeLibraryLoader {
        @Override // livekit.org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            String str2 = NativeLibrary.TAG;
            Logging.d(str2, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.d(TAG, "Native library has already been loaded.");
                    return;
                }
                String str2 = TAG;
                Logging.d(str2, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z10;
        synchronized (lock) {
            z10 = libraryLoaded;
        }
        return z10;
    }
}
