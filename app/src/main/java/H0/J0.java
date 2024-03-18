package H0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import k6.AbstractC4194d;
import r0.C5339c;

/* loaded from: classes2.dex */
public final class J0 implements AbstractC0707u0 {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f6760g = true;

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f6761a;

    /* renamed from: b  reason: collision with root package name */
    public int f6762b;

    /* renamed from: c  reason: collision with root package name */
    public int f6763c;

    /* renamed from: d  reason: collision with root package name */
    public int f6764d;

    /* renamed from: e  reason: collision with root package name */
    public int f6765e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6766f;

    public J0(C0714y c0714y) {
        RenderNode create = RenderNode.create("Compose", c0714y);
        this.f6761a = create;
        if (f6760g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                Q0 q02 = Q0.f6870a;
                q02.c(create, q02.a(create));
                q02.d(create, q02.b(create));
            }
            if (i10 >= 24) {
                P0.f6866a.a(create);
            } else {
                O0.f6836a.a(create);
            }
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f6760g = false;
        }
    }

    @Override // H0.AbstractC0707u0
    public final void A(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            Q0.f6870a.c(this.f6761a, i10);
        }
    }

    @Override // H0.AbstractC0707u0
    public final void B(float f6) {
        this.f6761a.setTranslationX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final int C() {
        return this.f6764d;
    }

    @Override // H0.AbstractC0707u0
    public final boolean D() {
        return this.f6761a.getClipToOutline();
    }

    @Override // H0.AbstractC0707u0
    public final void E(boolean z10) {
        this.f6761a.setClipToOutline(z10);
    }

    @Override // H0.AbstractC0707u0
    public final void F(float f6) {
        this.f6761a.setCameraDistance(-f6);
    }

    @Override // H0.AbstractC0707u0
    public final void G(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            Q0.f6870a.d(this.f6761a, i10);
        }
    }

    @Override // H0.AbstractC0707u0
    public final void H(float f6) {
        this.f6761a.setRotationX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void I(Matrix matrix) {
        this.f6761a.getMatrix(matrix);
    }

    @Override // H0.AbstractC0707u0
    public final float J() {
        return this.f6761a.getElevation();
    }

    @Override // H0.AbstractC0707u0
    public final float a() {
        return this.f6761a.getAlpha();
    }

    @Override // H0.AbstractC0707u0
    public final void b(float f6) {
        this.f6761a.setRotationY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void c(int i10) {
        this.f6762b += i10;
        this.f6764d += i10;
        this.f6761a.offsetLeftAndRight(i10);
    }

    @Override // H0.AbstractC0707u0
    public final int d() {
        return this.f6765e;
    }

    @Override // H0.AbstractC0707u0
    public final void f(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f6761a);
    }

    @Override // H0.AbstractC0707u0
    public final int g() {
        return this.f6762b;
    }

    @Override // H0.AbstractC0707u0
    public final int getHeight() {
        return this.f6765e - this.f6763c;
    }

    @Override // H0.AbstractC0707u0
    public final int getWidth() {
        return this.f6764d - this.f6762b;
    }

    @Override // H0.AbstractC0707u0
    public final void h(float f6) {
        this.f6761a.setRotation(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void i(float f6) {
        this.f6761a.setPivotX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void j(float f6) {
        this.f6761a.setTranslationY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void k(boolean z10) {
        this.f6766f = z10;
        this.f6761a.setClipToBounds(z10);
    }

    @Override // H0.AbstractC0707u0
    public final boolean l(int i10, int i11, int i12, int i13) {
        this.f6762b = i10;
        this.f6763c = i11;
        this.f6764d = i12;
        this.f6765e = i13;
        return this.f6761a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // H0.AbstractC0707u0
    public final void m() {
        int i10 = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.f6761a;
        if (i10 >= 24) {
            P0.f6866a.a(renderNode);
        } else {
            O0.f6836a.a(renderNode);
        }
    }

    @Override // H0.AbstractC0707u0
    public final void n(float f6) {
        this.f6761a.setPivotY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void o(float f6) {
        this.f6761a.setScaleY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void p(float f6) {
        this.f6761a.setElevation(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void q(int i10) {
        this.f6763c += i10;
        this.f6765e += i10;
        this.f6761a.offsetTopAndBottom(i10);
    }

    @Override // H0.AbstractC0707u0
    public final void r(int i10) {
        boolean c10 = r0.G.c(i10, 1);
        RenderNode renderNode = this.f6761a;
        if (c10) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (r0.G.c(i10, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // H0.AbstractC0707u0
    public final boolean s() {
        return this.f6761a.isValid();
    }

    @Override // H0.AbstractC0707u0
    public final void t(Outline outline) {
        this.f6761a.setOutline(outline);
    }

    @Override // H0.AbstractC0707u0
    public final boolean u() {
        return this.f6761a.setHasOverlappingRendering(true);
    }

    @Override // H0.AbstractC0707u0
    public final void v(F4.a aVar, r0.E e10, wf.k kVar) {
        int width = getWidth();
        int height = getHeight();
        RenderNode renderNode = this.f6761a;
        DisplayListCanvas start = renderNode.start(width, height);
        Canvas v10 = aVar.c().v();
        aVar.c().w((Canvas) start);
        C5339c c10 = aVar.c();
        if (e10 != null) {
            c10.h();
            AbstractC4194d.e(c10, e10);
        }
        kVar.invoke(c10);
        if (e10 != null) {
            c10.q();
        }
        aVar.c().w(v10);
        renderNode.end(start);
    }

    @Override // H0.AbstractC0707u0
    public final void w(float f6) {
        this.f6761a.setAlpha(f6);
    }

    @Override // H0.AbstractC0707u0
    public final boolean x() {
        return this.f6766f;
    }

    @Override // H0.AbstractC0707u0
    public final int y() {
        return this.f6763c;
    }

    @Override // H0.AbstractC0707u0
    public final void z(float f6) {
        this.f6761a.setScaleX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void e() {
    }
}
