package b4;

import ge.C3257a;
import id.AbstractC3557B;
import java.util.Set;
import jf.y;
import kotlin.jvm.internal.o;
import wf.k;

/* renamed from: b4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2120a extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25615Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Set f25616Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2120a(Set set, int i10) {
        super(1);
        this.f25615Y = i10;
        this.f25616Z = set;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f25615Y;
        Set<Xc.b> set = this.f25616Z;
        switch (i10) {
            case 0:
                String str = (String) obj;
                AbstractC3557B.c0("it", str);
                set.add(str);
                return yVar;
            case 1:
                io.ktor.client.plugins.auth.h hVar = (io.ktor.client.plugins.auth.h) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("$this$install", hVar);
                        hVar.f33361a.addAll(set);
                        break;
                    default:
                        AbstractC3557B.c0("$this$install", hVar);
                        hVar.f33361a.addAll(set);
                        break;
                }
                return yVar;
            case 2:
                io.ktor.client.plugins.auth.h hVar2 = (io.ktor.client.plugins.auth.h) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("$this$install", hVar2);
                        hVar2.f33361a.addAll(set);
                        break;
                    default:
                        AbstractC3557B.c0("$this$install", hVar2);
                        hVar2.f33361a.addAll(set);
                        break;
                }
                return yVar;
            default:
                ge.f fVar = (ge.f) obj;
                AbstractC3557B.c0("$this$config", fVar);
                for (Xc.b bVar : set) {
                    fVar.a(bVar.b(), C3257a.f31583i0);
                }
                return yVar;
        }
    }
}
