package X4;

import Ad.l;
import V4.b;
import V4.c;
import W4.e;
import W4.f;
import Z4.j;
import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import com.openai.chatgpt.R;
import g.RunnableC3111d;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import m.RunnableC4517N;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public Y4.a f21783a;

    /* renamed from: b  reason: collision with root package name */
    public b f21784b;

    /* renamed from: c  reason: collision with root package name */
    public final FloatBuffer f21785c;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f21787e;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f21786d = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public int f21788f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f21789g = -1;

    public a(Y4.a aVar) {
        this.f21783a = aVar;
        float[] fArr = new float[16];
        this.f21787e = fArr;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f21785c = asFloatBuffer;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = str + ": glError " + glGetError;
        AbstractC3557B.c0("message", str2);
        if (l.f821g) {
            AbstractC3612c.c("GLQuadRender", str2);
        }
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x007d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        f fVar;
        if (this.f21783a.f22101b != 0) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f21783a.f22101b);
            a("glUseProgram");
            d("inPosition", this.f21788f, 3, 0);
            d("inTextureCoord", this.f21789g, 2, 3);
            float[] fArr = this.f21786d;
            Matrix.setIdentityM(fArr, 0);
            ((e) this.f21783a.f22100a).c("uMVPMatrix", fArr);
            ((e) this.f21783a.f22100a).c("uSTMatrix", this.f21787e);
            b bVar = this.f21784b;
            if (bVar != null) {
                W4.b bVar2 = this.f21783a.f22100a;
                AbstractC3557B.c0("shaderParams", bVar2);
                c cVar = bVar.f18385a;
                cVar.post(new RunnableC4517N(cVar, 25, bVar2));
            }
            Y4.a aVar = this.f21783a;
            int i10 = aVar.f22101b;
            if (i10 != 0 && i10 != 0) {
                HashMap hashMap = ((e) aVar.f22100a).f20728a;
                for (String str : hashMap.keySet()) {
                    W4.a aVar2 = (W4.a) hashMap.get(str);
                    if (aVar2 != null && aVar2.f20724b != -1 && aVar2.f20725c != null) {
                        switch (AbstractC6708l.f(aVar2.f20723a)) {
                            case 0:
                                int i11 = aVar2.f20724b;
                                Object obj = aVar2.f20725c;
                                if (obj != null) {
                                    GLES20.glUniform1f(i11, ((Float) obj).floatValue());
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                            case 1:
                                int i12 = aVar2.f20724b;
                                Object obj2 = aVar2.f20725c;
                                if (obj2 != null) {
                                    GLES20.glUniform1i(i12, ((Integer) obj2).intValue());
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                }
                            case 2:
                                int i13 = aVar2.f20724b;
                                Object obj3 = aVar2.f20725c;
                                if (obj3 != null) {
                                    GLES20.glUniform1i(i13, ((Boolean) obj3).booleanValue() ? 1 : 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                            case 3:
                                int i14 = aVar2.f20724b;
                                Object obj4 = aVar2.f20725c;
                                if (obj4 != null) {
                                    GLES20.glUniform2fv(i14, 1, (float[]) obj4, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                }
                            case 4:
                                int i15 = aVar2.f20724b;
                                Object obj5 = aVar2.f20725c;
                                if (obj5 != null) {
                                    GLES20.glUniform3fv(i15, 1, (float[]) obj5, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                }
                            case 5:
                                int i16 = aVar2.f20724b;
                                Object obj6 = aVar2.f20725c;
                                if (obj6 != null) {
                                    GLES20.glUniform4fv(i16, 1, (float[]) obj6, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                }
                            case 6:
                                int i17 = aVar2.f20724b;
                                Object obj7 = aVar2.f20725c;
                                if (obj7 != null) {
                                    GLES20.glUniform2iv(i17, 1, (int[]) obj7, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                                }
                            case 7:
                                int i18 = aVar2.f20724b;
                                Object obj8 = aVar2.f20725c;
                                if (obj8 != null) {
                                    GLES20.glUniform3iv(i18, 1, (int[]) obj8, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                                }
                            case 8:
                                int i19 = aVar2.f20724b;
                                Object obj9 = aVar2.f20725c;
                                if (obj9 != null) {
                                    GLES20.glUniform4iv(i19, 1, (int[]) obj9, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                                }
                            case 9:
                                int i20 = aVar2.f20724b;
                                Object obj10 = aVar2.f20725c;
                                if (obj10 != null) {
                                    GLES20.glUniformMatrix3fv(i20, 1, false, (float[]) obj10, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                }
                            case 10:
                                int i21 = aVar2.f20724b;
                                Object obj11 = aVar2.f20725c;
                                if (obj11 != null) {
                                    GLES20.glUniformMatrix4fv(i21, 1, false, (float[]) obj11, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                }
                            case 11:
                                int i22 = aVar2.f20724b;
                                Object obj12 = aVar2.f20725c;
                                if (obj12 != null) {
                                    GLES30.glUniformMatrix3x4fv(i22, 1, false, (float[]) obj12, 0);
                                    continue;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                                }
                            case 13:
                                Object obj13 = aVar2.f20725c;
                                if (obj13 instanceof f) {
                                    fVar = (f) obj13;
                                } else {
                                    fVar = null;
                                }
                                if (fVar == null) {
                                    continue;
                                } else {
                                    AtomicBoolean atomicBoolean = fVar.f20731c;
                                    ReentrantLock reentrantLock = fVar.f20732d;
                                    reentrantLock.lock();
                                    try {
                                        if (atomicBoolean.get()) {
                                            fVar.f20730b.updateTexImage();
                                            atomicBoolean.set(false);
                                        }
                                        break;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                }
                        }
                    }
                }
            }
            GLES20.glBlendFunc(770, 771);
            GLES20.glEnable(3042);
            GLES20.glDrawArrays(5, 0, 4);
            a("glDrawArrays");
            GLES20.glFinish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Integer num;
        int i10;
        W4.b shaderParams;
        int c10;
        b bVar = this.f21784b;
        if (bVar != null) {
            c cVar = bVar.f18385a;
            boolean z10 = cVar.f18391H0;
            a aVar = cVar.f18394K0;
            if (z10 && (num = cVar.f18387D0) != null) {
                int intValue = num.intValue();
                aVar.f21783a.d();
                Y4.a aVar2 = aVar.f21783a;
                aVar2.getClass();
                Context context = cVar.getContext();
                AbstractC3557B.b0("context", context);
                Integer vertexShaderRawResId = cVar.getVertexShaderRawResId();
                if (vertexShaderRawResId == null) {
                    i10 = R.raw.quad_vert;
                } else {
                    i10 = vertexShaderRawResId.intValue();
                }
                Resources resources = context.getResources();
                AbstractC3557B.b0("context.resources", resources);
                String V10 = U3.f.V(i10, resources);
                Resources resources2 = context.getResources();
                AbstractC3557B.b0("context.resources", resources2);
                String V11 = U3.f.V(intValue, resources2);
                if (aVar2.f22101b != 0) {
                    aVar2.d();
                }
                int c11 = Y4.a.c(35633, V10);
                if (c11 != 0 && (c10 = Y4.a.c(35632, V11)) != 0) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    aVar2.f22101b = glCreateProgram;
                    if (glCreateProgram != 0) {
                        GLES20.glAttachShader(glCreateProgram, c11);
                        Y4.a.b("glAttachShader: vertex");
                        GLES20.glAttachShader(aVar2.f22101b, c10);
                        Y4.a.b("glAttachShader: pixel");
                        int i11 = aVar2.f22101b;
                        if (i11 != 0) {
                            GLES20.glLinkProgram(i11);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(aVar2.f22101b, 35714, iArr, 0);
                            if (iArr[0] != 1) {
                                if (l.f821g) {
                                    AbstractC3612c.c("GLShader", "Could not link program: ");
                                }
                                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(aVar2.f22101b);
                                AbstractC3557B.b0("glGetProgramInfoLog(program)", glGetProgramInfoLog);
                                if (l.f821g) {
                                    AbstractC3612c.c("GLShader", glGetProgramInfoLog);
                                }
                                GLES20.glDeleteProgram(aVar2.f22101b);
                                aVar2.f22101b = 0;
                            }
                        }
                    }
                    shaderParams = cVar.getShaderParams();
                    if (shaderParams != null) {
                        aVar2.f22100a = shaderParams;
                    }
                    cVar.f18391H0 = true;
                    aVar.f21783a = aVar2;
                }
                if (l.f821g) {
                    AbstractC3612c.c("GLShader", "shader program wasn't created");
                }
                shaderParams = cVar.getShaderParams();
                if (shaderParams != null) {
                }
                cVar.f18391H0 = true;
                aVar.f21783a = aVar2;
            }
            aVar.f21783a.a(cVar.getResources());
            cVar.post(new RunnableC3111d(26, cVar));
        }
        Y4.a aVar3 = this.f21783a;
        if (aVar3.f22101b != 0) {
            e eVar = (e) aVar3.f22100a;
            eVar.getClass();
            eVar.a("uMVPMatrix", new W4.a(11, null));
            eVar.a("uSTMatrix", new W4.a(11, null));
            aVar3.f22100a = eVar;
            this.f21783a.a(null);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f21783a.f22101b, "inPosition");
            a("glGetAttribLocation ".concat("inPosition"));
            this.f21788f = glGetAttribLocation;
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f21783a.f22101b, "inTextureCoord");
            a("glGetAttribLocation ".concat("inTextureCoord"));
            this.f21789g = glGetAttribLocation2;
        }
    }

    public final void d(String str, int i10, int i11, int i12) {
        if (i10 == -1) {
            return;
        }
        this.f21785c.position(i12);
        GLES20.glVertexAttribPointer(i10, i11, 5126, false, 20, (Buffer) this.f21785c);
        a("glVertexAttribPointer ".concat(str));
        GLES20.glEnableVertexAttribArray(i10);
        a("glEnableVertexAttribArray ".concat(str));
    }
}
