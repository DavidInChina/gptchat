package V4;

import W4.e;
import Z4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import wf.k;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: C0  reason: collision with root package name */
    public Integer f18386C0;

    /* renamed from: D0  reason: collision with root package name */
    public Integer f18387D0;

    /* renamed from: E0  reason: collision with root package name */
    public W4.b f18388E0;

    /* renamed from: F0  reason: collision with root package name */
    public k f18389F0;

    /* renamed from: G0  reason: collision with root package name */
    public k f18390G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f18391H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f18392I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f18393J0;

    /* renamed from: K0  reason: collision with root package name */
    public final X4.a f18394K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y4.a, java.lang.Object] */
    public c(Context context) {
        super(context, null, 0);
        AbstractC3557B.c0("context", context);
        b bVar = new b(this);
        e eVar = new e();
        ?? obj = new Object();
        obj.f22100a = eVar;
        X4.a aVar = new X4.a(obj);
        this.f18394K0 = aVar;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, a.f18384a, 0, 0);
        try {
            setFragmentShaderRawResId(Integer.valueOf(obtainStyledAttributes.getResourceId(0, R.raw.default_frag)));
            setVertexShaderRawResId(Integer.valueOf(obtainStyledAttributes.getResourceId(1, R.raw.quad_vert)));
            obtainStyledAttributes.recycle();
            setEGLContextClientVersion(3);
            aVar.f21784b = bVar;
            setEGLConfigChooser(new Z4.a(this, 8, 16));
            setRenderer(aVar);
            setOpaque(false);
            setRenderMode(0);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean getDebugMode() {
        return this.f18392I0;
    }

    public final Integer getFragmentShaderRawResId() {
        return this.f18387D0;
    }

    public final k getOnDrawFrameListener() {
        return this.f18390G0;
    }

    public final k getOnViewReadyListener() {
        return this.f18389F0;
    }

    public final W4.b getShaderParams() {
        return this.f18388E0;
    }

    public final boolean getUpdateContinuously() {
        return this.f18393J0;
    }

    public final Integer getVertexShaderRawResId() {
        return this.f18386C0;
    }

    @Override // Z4.l, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC3557B.c0("surface", surfaceTexture);
        this.f18394K0.f21783a.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    public final void setDebugMode(boolean z10) {
        this.f18392I0 = z10;
        Ad.l.f821g = z10;
        if (z10) {
            setDebugFlags(0);
            setEnableLogPauseResume$lib_release(true);
            setEnableLogEgl$lib_release(true);
            setEnableLogSurface$lib_release(true);
        }
    }

    public final void setFragmentShaderRawResId(Integer num) {
        this.f18391H0 = true;
        this.f18387D0 = num;
    }

    public final void setOnDrawFrameListener(k kVar) {
        this.f18390G0 = kVar;
    }

    public final void setOnViewReadyListener(k kVar) {
        this.f18389F0 = kVar;
    }

    public final void setShaderParams(W4.b bVar) {
        this.f18388E0 = bVar;
        if (!this.f18391H0 && bVar != null) {
            Y4.a aVar = this.f18394K0.f21783a;
            aVar.getClass();
            aVar.f22100a = bVar;
        }
    }

    public final void setUpdateContinuously(boolean z10) {
        if (this.f18393J0 == z10) {
            return;
        }
        this.f18393J0 = z10;
        if (z10) {
            setRenderMode(1);
        } else {
            setRenderMode(0);
        }
    }

    public final void setVertexShaderRawResId(Integer num) {
        this.f18391H0 = true;
        this.f18386C0 = num;
    }
}
