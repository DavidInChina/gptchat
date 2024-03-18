package y2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: y2.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SurfaceHolder$CallbackC6500C implements J2.x, G2.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AbstractC6517d {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6504G f50334Y;

    public SurfaceHolder$CallbackC6500C(C6504G c6504g) {
        this.f50334Y = c6504g;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C6504G c6504g = this.f50334Y;
        c6504g.getClass();
        Surface surface = new Surface(surfaceTexture);
        c6504g.y(surface);
        c6504g.f50354M = surface;
        C6504G.c(c6504g, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C6504G c6504g = this.f50334Y;
        c6504g.y(null);
        C6504G.c(c6504g, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        C6504G.c(this.f50334Y, i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C6504G.c(this.f50334Y, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f50334Y.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C6504G c6504g = this.f50334Y;
        c6504g.getClass();
        C6504G.c(c6504g, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
