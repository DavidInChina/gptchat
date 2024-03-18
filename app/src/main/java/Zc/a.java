package Zc;

import b4.C2120a;
import ge.C3257a;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Set;
import jf.y;
import kotlin.jvm.internal.o;
import wf.k;
import yc.C6576b;

/* loaded from: classes2.dex */
public final class a extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23664Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Set f23665Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Set f23666h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Set set, Set set2, int i10) {
        super(1);
        this.f23664Y = i10;
        this.f23665Z = set;
        this.f23666h0 = set2;
    }

    public final void a(ge.f fVar) {
        C3257a c3257a = C3257a.f31583i0;
        int i10 = this.f23664Y;
        Set set = this.f23666h0;
        Set<Xc.a> set2 = this.f23665Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$config", fVar);
                for (Xc.a aVar : set2) {
                    fVar.a(((C6576b) aVar).b(), c3257a);
                }
                fVar.a(io.ktor.client.plugins.auth.h.f33356b, new C2120a(set, 1));
                return;
            default:
                AbstractC3557B.c0("$this$config", fVar);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    fVar.a(((Xc.d) it.next()).b(), c3257a);
                }
                fVar.a(io.ktor.client.plugins.auth.h.f33356b, new C2120a(set, 2));
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f23664Y) {
            case 0:
                a((ge.f) obj);
                return yVar;
            default:
                a((ge.f) obj);
                return yVar;
        }
    }
}
