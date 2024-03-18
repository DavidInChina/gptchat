package hh;

import android.app.Application;

/* renamed from: hh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3434b implements AbstractC3440h {

    /* renamed from: a  reason: collision with root package name */
    public final C3433a f32346a = new C3433a(this);

    /* renamed from: b  reason: collision with root package name */
    public final Application f32347b;

    /* renamed from: c  reason: collision with root package name */
    public final C3443k f32348c;

    public C3434b(Application application, C3443k c3443k) {
        this.f32347b = application;
        this.f32348c = c3443k;
    }

    @Override // hh.AbstractC3440h
    public final void a() {
        this.f32347b.registerActivityLifecycleCallbacks(this.f32346a);
    }
}
