package H0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import r0.C5339c;

/* loaded from: classes2.dex */
public final class L0 implements AbstractC0707u0 {

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f6775a = K0.c();

    @Override // H0.AbstractC0707u0
    public final void A(int i10) {
        this.f6775a.setAmbientShadowColor(i10);
    }

    @Override // H0.AbstractC0707u0
    public final void B(float f6) {
        this.f6775a.setTranslationX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final int C() {
        int right;
        right = this.f6775a.getRight();
        return right;
    }

    @Override // H0.AbstractC0707u0
    public final boolean D() {
        boolean clipToOutline;
        clipToOutline = this.f6775a.getClipToOutline();
        return clipToOutline;
    }

    @Override // H0.AbstractC0707u0
    public final void E(boolean z10) {
        this.f6775a.setClipToOutline(z10);
    }

    @Override // H0.AbstractC0707u0
    public final void F(float f6) {
        this.f6775a.setCameraDistance(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void G(int i10) {
        this.f6775a.setSpotShadowColor(i10);
    }

    @Override // H0.AbstractC0707u0
    public final void H(float f6) {
        this.f6775a.setRotationX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void I(Matrix matrix) {
        this.f6775a.getMatrix(matrix);
    }

    @Override // H0.AbstractC0707u0
    public final float J() {
        float elevation;
        elevation = this.f6775a.getElevation();
        return elevation;
    }

    @Override // H0.AbstractC0707u0
    public final float a() {
        float alpha;
        alpha = this.f6775a.getAlpha();
        return alpha;
    }

    @Override // H0.AbstractC0707u0
    public final void b(float f6) {
        this.f6775a.setRotationY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void c(int i10) {
        this.f6775a.offsetLeftAndRight(i10);
    }

    @Override // H0.AbstractC0707u0
    public final int d() {
        int bottom;
        bottom = this.f6775a.getBottom();
        return bottom;
    }

    @Override // H0.AbstractC0707u0
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            M0.f6777a.a(this.f6775a, null);
        }
    }

    @Override // H0.AbstractC0707u0
    public final void f(Canvas canvas) {
        canvas.drawRenderNode(this.f6775a);
    }

    @Override // H0.AbstractC0707u0
    public final int g() {
        int left;
        left = this.f6775a.getLeft();
        return left;
    }

    @Override // H0.AbstractC0707u0
    public final int getHeight() {
        int height;
        height = this.f6775a.getHeight();
        return height;
    }

    @Override // H0.AbstractC0707u0
    public final int getWidth() {
        int width;
        width = this.f6775a.getWidth();
        return width;
    }

    @Override // H0.AbstractC0707u0
    public final void h(float f6) {
        this.f6775a.setRotationZ(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void i(float f6) {
        this.f6775a.setPivotX(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void j(float f6) {
        this.f6775a.setTranslationY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void k(boolean z10) {
        this.f6775a.setClipToBounds(z10);
    }

    @Override // H0.AbstractC0707u0
    public final boolean l(int i10, int i11, int i12, int i13) {
        boolean position;
        position = this.f6775a.setPosition(i10, i11, i12, i13);
        return position;
    }

    @Override // H0.AbstractC0707u0
    public final void m() {
        this.f6775a.discardDisplayList();
    }

    @Override // H0.AbstractC0707u0
    public final void n(float f6) {
        this.f6775a.setPivotY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void o(float f6) {
        this.f6775a.setScaleY(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void p(float f6) {
        this.f6775a.setElevation(f6);
    }

    @Override // H0.AbstractC0707u0
    public final void q(int i10) {
        this.f6775a.offsetTopAndBottom(i10);
    }

    @Override // H0.AbstractC0707u0
    public final void r(int i10) {
        boolean c10 = r0.G.c(i10, 1);
        RenderNode renderNode = this.f6775a;
        if (c10) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (r0.G.c(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // H0.AbstractC0707u0
    public final boolean s() {
        boolean hasDisplayList;
        hasDisplayList = this.f6775a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // H0.AbstractC0707u0
    public final void t(Outline outline) {
        this.f6775a.setOutline(outline);
    }

    @Override // H0.AbstractC0707u0
    public final boolean u() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f6775a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // H0.AbstractC0707u0
    public final void v(F4.a aVar, r0.E e10, wf.k kVar) {
        RecordingCanvas beginRecording;
        RenderNode renderNode = this.f6775a;
        beginRecording = renderNode.beginRecording();
        C5339c c5339c = (C5339c) aVar.f5033Z;
        Canvas canvas = c5339c.f44230a;
        c5339c.f44230a = beginRecording;
        if (e10 != null) {
            c5339c.h();
            c5339c.g(e10, 1);
        }
        kVar.invoke(c5339c);
        if (e10 != null) {
            c5339c.q();
        }
        ((C5339c) aVar.f5033Z).f44230a = canvas;
        renderNode.endRecording();
    }

    @Override // H0.AbstractC0707u0
    public final void w(float f6) {
        this.f6775a.setAlpha(f6);
    }

    @Override // H0.AbstractC0707u0
    public final boolean x() {
        boolean clipToBounds;
        clipToBounds = this.f6775a.getClipToBounds();
        return clipToBounds;
    }

    @Override // H0.AbstractC0707u0
    public final int y() {
        int top;
        top = this.f6775a.getTop();
        return top;
    }

    @Override // H0.AbstractC0707u0
    public final void z(float f6) {
        this.f6775a.setScaleX(f6);
    }
}
