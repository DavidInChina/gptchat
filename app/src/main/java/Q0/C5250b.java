package q0;

import M3.H;

/* renamed from: q0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5250b {

    /* renamed from: a  reason: collision with root package name */
    public float f43615a;

    /* renamed from: b  reason: collision with root package name */
    public float f43616b;

    /* renamed from: c  reason: collision with root package name */
    public float f43617c;

    /* renamed from: d  reason: collision with root package name */
    public float f43618d;

    public final void a(float f6, float f10, float f11, float f12) {
        this.f43615a = Math.max(f6, this.f43615a);
        this.f43616b = Math.max(f10, this.f43616b);
        this.f43617c = Math.min(f11, this.f43617c);
        this.f43618d = Math.min(f12, this.f43618d);
    }

    public final boolean b() {
        if (this.f43615a < this.f43617c && this.f43616b < this.f43618d) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "MutableRect(" + H.A0(this.f43615a) + ", " + H.A0(this.f43616b) + ", " + H.A0(this.f43617c) + ", " + H.A0(this.f43618d) + ')';
    }
}
