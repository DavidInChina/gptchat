package o4;

import w.C6068o;

/* loaded from: classes2.dex */
public final class h extends C6068o {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i f40591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, i iVar) {
        super(i10);
        this.f40591g = iVar;
    }

    @Override // w.C6068o
    public final void a(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj2;
        g gVar2 = (g) obj3;
        this.f40591g.f40592a.d((c) obj, gVar.f40588a, gVar.f40589b, gVar.f40590c);
    }

    @Override // w.C6068o
    public final int f(Object obj, Object obj2) {
        c cVar = (c) obj;
        return ((g) obj2).f40590c;
    }
}
