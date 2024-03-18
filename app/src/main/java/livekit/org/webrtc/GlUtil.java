package livekit.org.webrtc;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class GlUtil {

    /* loaded from: classes.dex */
    public static class GlOutOfMemoryException extends GLException {
        public GlOutOfMemoryException(int i10, String str) {
            super(i10, str);
        }
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError != 1285) {
                throw new GLException(glGetError, str + ": GLES20 error: " + glGetError);
            }
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        FloatBuffer floatBuffer = (FloatBuffer) asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int generateTexture(int i10) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        GLES20.glBindTexture(i10, i11);
        GLES20.glTexParameterf(i10, 10241, 9729.0f);
        GLES20.glTexParameterf(i10, 10240, 9729.0f);
        GLES20.glTexParameterf(i10, 10242, 33071.0f);
        GLES20.glTexParameterf(i10, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i11;
    }
}
