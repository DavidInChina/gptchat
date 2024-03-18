package H3;

import N.C1025i;
import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class i extends l {

    /* renamed from: e  reason: collision with root package name */
    public C1025i f7367e;

    /* renamed from: f  reason: collision with root package name */
    public float f7368f;

    /* renamed from: g  reason: collision with root package name */
    public C1025i f7369g;

    /* renamed from: h  reason: collision with root package name */
    public float f7370h;

    /* renamed from: i  reason: collision with root package name */
    public float f7371i;

    /* renamed from: j  reason: collision with root package name */
    public float f7372j;

    /* renamed from: k  reason: collision with root package name */
    public float f7373k;

    /* renamed from: l  reason: collision with root package name */
    public float f7374l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Cap f7375m;

    /* renamed from: n  reason: collision with root package name */
    public Paint.Join f7376n;

    /* renamed from: o  reason: collision with root package name */
    public float f7377o;

    @Override // H3.k
    public final boolean a() {
        if (!this.f7369g.i() && !this.f7367e.i()) {
            return false;
        }
        return true;
    }

    @Override // H3.k
    public final boolean b(int[] iArr) {
        return this.f7367e.n(iArr) | this.f7369g.n(iArr);
    }

    public float getFillAlpha() {
        return this.f7371i;
    }

    public int getFillColor() {
        return this.f7369g.f12350Z;
    }

    public float getStrokeAlpha() {
        return this.f7370h;
    }

    public int getStrokeColor() {
        return this.f7367e.f12350Z;
    }

    public float getStrokeWidth() {
        return this.f7368f;
    }

    public float getTrimPathEnd() {
        return this.f7373k;
    }

    public float getTrimPathOffset() {
        return this.f7374l;
    }

    public float getTrimPathStart() {
        return this.f7372j;
    }

    public void setFillAlpha(float f6) {
        this.f7371i = f6;
    }

    public void setFillColor(int i10) {
        this.f7369g.f12350Z = i10;
    }

    public void setStrokeAlpha(float f6) {
        this.f7370h = f6;
    }

    public void setStrokeColor(int i10) {
        this.f7367e.f12350Z = i10;
    }

    public void setStrokeWidth(float f6) {
        this.f7368f = f6;
    }

    public void setTrimPathEnd(float f6) {
        this.f7373k = f6;
    }

    public void setTrimPathOffset(float f6) {
        this.f7374l = f6;
    }

    public void setTrimPathStart(float f6) {
        this.f7372j = f6;
    }
}
