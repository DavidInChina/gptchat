package d9;

import wf.AbstractC6216a;

/* renamed from: d9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2608c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2608c f28128Z = new C2608c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2608c f28129h0 = new C2608c(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28130Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2608c(int i10) {
        super(0);
        this.f28130Y = i10;
    }

    public final f9.p a() {
        switch (this.f28130Y) {
            case 0:
                Object b10 = ld.g.f38286a.b(f9.p.class);
                if (b10 != null) {
                    return (f9.p) b10;
                }
                throw new ld.h("Couldn't find component of type ".concat(f9.p.class.getName()));
            default:
                Object b11 = ld.g.f38286a.b(f9.p.class);
                if (b11 != null) {
                    return (f9.p) b11;
                }
                throw new ld.h("Couldn't find component of type ".concat(f9.p.class.getName()));
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f28130Y) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
