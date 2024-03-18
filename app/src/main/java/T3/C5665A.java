package t3;

import id.AbstractC3557B;
import java.util.Iterator;
import s3.AbstractC5540C;
import s3.C5562l;
import y.AbstractC6482u;
import y.C6460A;
import y.d0;
import y.e0;

/* renamed from: t3.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5665A extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45674Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f45675Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f45676h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f45677i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5665A(i iVar, wf.k kVar, wf.k kVar2, int i10) {
        super(1);
        this.f45674Y = i10;
        this.f45675Z = iVar;
        this.f45676h0 = kVar;
        this.f45677i0 = kVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141 A[SYNTHETIC] */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        d0 d0Var;
        d0 d0Var2;
        e0 e0Var;
        e0 e0Var2;
        int i10 = this.f45674Y;
        wf.k kVar = this.f45677i0;
        wf.k kVar2 = this.f45676h0;
        e0 e0Var3 = null;
        i iVar = this.f45675Z;
        switch (i10) {
            case 0:
                C6460A c6460a = (C6460A) ((AbstractC6482u) obj);
                AbstractC5540C abstractC5540C = ((C5562l) c6460a.c()).f45306Z;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", abstractC5540C);
                h hVar = (h) abstractC5540C;
                if (((Boolean) iVar.f45689c.getValue()).booleanValue()) {
                    int i11 = AbstractC5540C.f45214n0;
                    Iterator it = B2.u.x(hVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC5540C abstractC5540C2 = (AbstractC5540C) it.next();
                            if (abstractC5540C2 instanceof h) {
                                wf.k kVar3 = ((h) abstractC5540C2).f45687r0;
                                if (kVar3 != null) {
                                    d0Var2 = (d0) kVar3.invoke(c6460a);
                                    continue;
                                    if (d0Var2 != null) {
                                        e0Var3 = d0Var2;
                                    }
                                }
                            } else if (abstractC5540C2 instanceof C5671f) {
                                ((C5671f) abstractC5540C2).getClass();
                            }
                            d0Var2 = null;
                            continue;
                            if (d0Var2 != null) {
                            }
                        }
                    }
                    if (e0Var3 == null) {
                        return (d0) kVar2.invoke(c6460a);
                    }
                    return e0Var3;
                }
                int i12 = AbstractC5540C.f45214n0;
                Iterator it2 = B2.u.x(hVar).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        AbstractC5540C abstractC5540C3 = (AbstractC5540C) it2.next();
                        if (abstractC5540C3 instanceof h) {
                            wf.k kVar4 = ((h) abstractC5540C3).f45685p0;
                            if (kVar4 != null) {
                                d0Var = (d0) kVar4.invoke(c6460a);
                                continue;
                                if (d0Var != null) {
                                    e0Var3 = d0Var;
                                }
                            }
                        } else if (abstractC5540C3 instanceof C5671f) {
                            ((C5671f) abstractC5540C3).getClass();
                        }
                        d0Var = null;
                        continue;
                        if (d0Var != null) {
                        }
                    }
                }
                if (e0Var3 == null) {
                    return (d0) kVar.invoke(c6460a);
                }
                return e0Var3;
            default:
                C6460A c6460a2 = (C6460A) ((AbstractC6482u) obj);
                AbstractC5540C abstractC5540C4 = ((C5562l) c6460a2.a()).f45306Z;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", abstractC5540C4);
                h hVar2 = (h) abstractC5540C4;
                if (((Boolean) iVar.f45689c.getValue()).booleanValue()) {
                    int i13 = AbstractC5540C.f45214n0;
                    Iterator it3 = B2.u.x(hVar2).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            AbstractC5540C abstractC5540C5 = (AbstractC5540C) it3.next();
                            if (abstractC5540C5 instanceof h) {
                                wf.k kVar5 = ((h) abstractC5540C5).f45688s0;
                                if (kVar5 != null) {
                                    e0Var2 = (e0) kVar5.invoke(c6460a2);
                                    continue;
                                    if (e0Var2 != null) {
                                        e0Var3 = e0Var2;
                                    }
                                }
                            } else if (abstractC5540C5 instanceof C5671f) {
                                ((C5671f) abstractC5540C5).getClass();
                            }
                            e0Var2 = null;
                            continue;
                            if (e0Var2 != null) {
                            }
                        }
                    }
                    if (e0Var3 == null) {
                        return (e0) kVar2.invoke(c6460a2);
                    }
                    return e0Var3;
                }
                int i14 = AbstractC5540C.f45214n0;
                Iterator it4 = B2.u.x(hVar2).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AbstractC5540C abstractC5540C6 = (AbstractC5540C) it4.next();
                        if (abstractC5540C6 instanceof h) {
                            wf.k kVar6 = ((h) abstractC5540C6).f45686q0;
                            if (kVar6 != null) {
                                e0Var = (e0) kVar6.invoke(c6460a2);
                                continue;
                                if (e0Var != null) {
                                    e0Var3 = e0Var;
                                }
                            }
                        } else if (abstractC5540C6 instanceof C5671f) {
                            ((C5671f) abstractC5540C6).getClass();
                        }
                        e0Var = null;
                        continue;
                        if (e0Var != null) {
                        }
                    }
                }
                if (e0Var3 == null) {
                    return (e0) kVar.invoke(c6460a2);
                }
                return e0Var3;
        }
    }
}
