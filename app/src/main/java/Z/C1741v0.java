package Z;

import w.C6072s;
import w.C6073t;

/* renamed from: Z.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1741v0 implements AbstractC1739u0 {

    /* renamed from: a  reason: collision with root package name */
    public int f22736a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC1743w0 f22737b;

    /* renamed from: c  reason: collision with root package name */
    public C1705d f22738c;

    /* renamed from: d  reason: collision with root package name */
    public wf.n f22739d;

    /* renamed from: e  reason: collision with root package name */
    public int f22740e;

    /* renamed from: f  reason: collision with root package name */
    public C6072s f22741f;

    /* renamed from: g  reason: collision with root package name */
    public C6073t f22742g;

    public C1741v0(C1744x c1744x) {
        this.f22737b = c1744x;
    }

    public final boolean a() {
        C1705d c1705d;
        if (this.f22737b != null && (c1705d = this.f22738c) != null && c1705d.a()) {
            return true;
        }
        return false;
    }

    public final int b(Object obj) {
        int c10;
        AbstractC1743w0 abstractC1743w0 = this.f22737b;
        if (abstractC1743w0 == null || (c10 = abstractC1743w0.c(this, obj)) == 0) {
            return 1;
        }
        return c10;
    }

    public final void c(boolean z10) {
        if (z10) {
            this.f22736a |= 32;
        } else {
            this.f22736a &= -33;
        }
    }
}
