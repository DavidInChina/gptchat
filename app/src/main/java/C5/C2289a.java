package c5;

import M3.H;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.opengl.GLSurfaceView;
import f5.C2937a;
import g.RunnableC3118k;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: c5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2289a implements GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2294f f26247a;

    public C2289a(C2294f c2294f) {
        this.f26247a = c2294f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C2294f c2294f = this.f26247a;
        try {
            if (c2294f.d() != null) {
                Context m10 = c2294f.m();
                if (H.f11528b == null) {
                    H.f11528b = m10.getSharedPreferences("ArkoseLabsSDK", 0);
                }
                SharedPreferences.Editor edit = H.f11528b.edit();
                edit.putString("gpuInfo", gl10.glGetString(7936) + Separators.COMMA + gl10.glGetString(7938) + Separators.COMMA + gl10.glGetString(7937));
                edit.apply();
                c2294f.d().runOnUiThread(new RunnableC3118k(14, this));
            }
        } catch (Exception e10) {
            C2937a.c("ChallengeFragment", e10.getMessage(), new Throwable[0]);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
    }
}
