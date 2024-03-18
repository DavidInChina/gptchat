package X1;

import e2.C2777i;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: b  reason: collision with root package name */
    public p f21747b;

    /* renamed from: a  reason: collision with root package name */
    public m f21746a = k.f21752b;

    /* renamed from: c  reason: collision with root package name */
    public int f21748c = 1;

    @Override // X1.h
    public final h a() {
        i iVar = new i();
        iVar.f21746a = this.f21746a;
        iVar.f21747b = this.f21747b;
        iVar.f21748c = this.f21748c;
        return iVar;
    }

    @Override // X1.h
    public final void b(m mVar) {
        this.f21746a = mVar;
    }

    @Override // X1.h
    public final m c() {
        return this.f21746a;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f21746a + ", provider=" + this.f21747b + ", colorFilterParams=" + ((Object) null) + ", contentScale=" + ((Object) C2777i.b(this.f21748c)) + ')';
    }
}
