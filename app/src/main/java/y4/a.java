package Y4;

import Ad.l;
import W4.b;
import W4.d;
import W4.e;
import W4.f;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f22100a;

    /* renamed from: b  reason: collision with root package name */
    public int f22101b;

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = str + ": glError " + glGetError;
        AbstractC3557B.c0("message", str2);
        if (l.f821g) {
            AbstractC3612c.c("GLShader", str2);
        }
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    public static int c(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String str2 = "Could not compile shader " + i10 + ":";
                AbstractC3557B.c0("message", str2);
                if (l.f821g) {
                    AbstractC3612c.c("GLShader", str2);
                }
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                AbstractC3557B.b0("glGetShaderInfoLog(shader)", glGetShaderInfoLog);
                if (l.f821g) {
                    AbstractC3612c.c("GLShader", glGetShaderInfoLog);
                }
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    public final void a(Resources resources) {
        W4.a aVar;
        int i10 = this.f22101b;
        if (i10 == 0) {
            return;
        }
        HashMap hashMap = ((e) this.f22100a).f20728a;
        for (String str : hashMap.keySet()) {
            AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, str);
            W4.a aVar2 = (W4.a) hashMap.get(str);
            if (aVar2 != null) {
                aVar2.f20724b = GLES20.glGetUniformLocation(i10, str);
            }
            if (resources != null && (aVar = (W4.a) hashMap.get(str)) != null) {
                int f6 = AbstractC6708l.f(aVar.f20723a);
                if (f6 != 12) {
                    if (f6 == 13 && aVar.f20725c == null) {
                        int[] iArr = new int[1];
                        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
                        int i11 = iArr[0];
                        if (i11 != 0) {
                            GLES20.glBindTexture(36197, i11);
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            aVar.f20724b = iArr[0];
                            SurfaceTexture surfaceTexture = new SurfaceTexture(aVar.f20724b);
                            final f fVar = new f(new Surface(surfaceTexture), surfaceTexture);
                            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: W4.c
                                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                                    f fVar2 = f.this;
                                    AbstractC3557B.c0("$this_apply", fVar2);
                                    ReentrantLock reentrantLock = fVar2.f20732d;
                                    reentrantLock.lock();
                                    try {
                                        fVar2.f20731c.set(true);
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                }
                            });
                            aVar.f20725c = fVar;
                        } else {
                            throw new RuntimeException("It's not possible to generate ID for texture");
                        }
                    }
                } else {
                    aVar.f20725c = aVar.f20725c;
                }
            }
        }
    }

    public final void d() {
        f fVar;
        int i10 = this.f22101b;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
            this.f22101b = 0;
        }
        HashMap hashMap = ((e) this.f22100a).f20728a;
        for (String str : hashMap.keySet()) {
            W4.a aVar = (W4.a) hashMap.get(str);
            if (aVar != null && d.f20727a[AbstractC6708l.f(aVar.f20723a)] == 1) {
                Object obj = aVar.f20725c;
                if (obj instanceof f) {
                    fVar = (f) obj;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    ReentrantLock reentrantLock = fVar.f20732d;
                    reentrantLock.lock();
                    try {
                        fVar.f20730b.release();
                        fVar.f20729a.release();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                aVar.f20725c = null;
            }
        }
    }
}
