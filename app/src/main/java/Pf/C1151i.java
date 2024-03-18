package Pf;

import hg.C3422a;
import java.util.List;
import kg.C4294f;
import wf.AbstractC6216a;

/* renamed from: Pf.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1151i implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14098Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f14099Z;

    public /* synthetic */ C1151i(int i10, Object obj) {
        this.f14098Y = i10;
        this.f14099Z = obj;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f14098Y;
        Object obj = this.f14099Z;
        switch (i10) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                Jf.j jVar = (Jf.j) obj;
                sb2.append(((C4294f) jVar.f9112Z).b());
                return C3422a.f(sb2.toString(), ((AbstractC1153k) jVar.f9113h0).getUpperBounds());
            default:
                return (List) obj;
        }
    }
}
