package a7;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* renamed from: a7.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1934c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23903Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f23904Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1934c(d dVar, int i10) {
        super(0);
        this.f23903Y = i10;
        this.f23904Z = dVar;
    }

    public final Boolean a() {
        int i10 = this.f23903Y;
        boolean z10 = true;
        d dVar = this.f23904Z;
        switch (i10) {
            case 0:
                List list = dVar.f23906b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            l b10 = ((g) ((h) it.next())).b();
                            AbstractC3557B.c0("<this>", b10);
                            if (!AbstractC3557B.K(b10, k.f23923a)) {
                                if (!((List) dVar.f23907c.getValue()).isEmpty()) {
                                    z10 = false;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                List<h> list2 = dVar.f23906b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (h hVar : list2) {
                        if (AbstractC4344b.w0(((g) hVar).b())) {
                            return Boolean.valueOf(z10);
                        }
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f23903Y) {
            case 0:
                return a();
            case 1:
                List list = this.f23904Z.f23906b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!AbstractC3557B.K(((g) ((h) obj)).b(), k.f23923a)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return a();
        }
    }
}
