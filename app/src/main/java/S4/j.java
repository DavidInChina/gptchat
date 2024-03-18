package S4;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import r9.y;

/* loaded from: classes2.dex */
public final class j extends p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16167f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f16168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, S4.e] */
    public j(b bVar, int i10) {
        super("method_handles", bVar, 8);
        this.f16167f = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        this.f16168g = new TreeMap();
                        return;
                    }
                    super(null, bVar, 4);
                    ?? obj = new Object();
                    obj.f16155Y = -1;
                    obj.f16155Y = 0;
                    this.f16168g = Collections.singletonList(obj);
                    return;
                }
                super("type_ids", bVar, 4);
                this.f16168g = new TreeMap();
                return;
            }
            super("string_ids", bVar, 4);
            this.f16168g = new TreeMap();
            return;
        }
        super("proto_ids", bVar, 4);
        this.f16168g = new TreeMap();
    }

    @Override // S4.n
    public final Collection c() {
        int i10 = this.f16167f;
        Object obj = this.f16168g;
        switch (i10) {
            case 0:
                return ((TreeMap) obj).values();
            case 1:
                return ((TreeMap) obj).values();
            case 2:
                return ((TreeMap) obj).values();
            case 3:
                return ((TreeMap) obj).values();
            default:
                return (List) obj;
        }
    }

    @Override // S4.p
    public final void j() {
        int i10 = this.f16167f;
        Object obj = this.f16168g;
        switch (i10) {
            case 0:
                Iterator it = ((TreeMap) obj).values().iterator();
                if (!it.hasNext()) {
                    return;
                }
                AbstractC2469q0.p(it.next());
                throw null;
            case 1:
                Iterator it2 = c().iterator();
                if (!it2.hasNext()) {
                    return;
                }
                AbstractC2469q0.p(it2.next());
                throw null;
            case 2:
                Iterator it3 = ((TreeMap) obj).values().iterator();
                if (!it3.hasNext()) {
                    return;
                }
                AbstractC2469q0.p(it3.next());
                throw null;
            case 3:
                Iterator it4 = c().iterator();
                if (!it4.hasNext()) {
                    return;
                }
                AbstractC2469q0.p(it4.next());
                throw null;
            default:
                return;
        }
    }

    public final void k(U4.a aVar) {
        int i10;
        int i11 = this.f16167f;
        int i12 = 0;
        Object obj = this.f16168g;
        switch (i11) {
            case 1:
                f();
                int size = ((TreeMap) obj).size();
                if (size != 0) {
                    i12 = b();
                }
                if (size <= 65536) {
                    U4.c cVar = (U4.c) aVar;
                    if (cVar.c()) {
                        cVar.b(4, "proto_ids_size:  ".concat(y.d1(size)));
                        cVar.b(4, "proto_ids_off:   ".concat(y.d1(i12)));
                    }
                    cVar.d(size);
                    cVar.d(i12);
                    return;
                }
                throw new UnsupportedOperationException("too many proto ids");
            case 2:
                f();
                int size2 = ((TreeMap) obj).size();
                if (size2 != 0) {
                    i12 = b();
                }
                U4.c cVar2 = (U4.c) aVar;
                if (cVar2.c()) {
                    cVar2.b(4, "string_ids_size: ".concat(y.d1(size2)));
                    cVar2.b(4, "string_ids_off:  ".concat(y.d1(i12)));
                }
                cVar2.d(size2);
                cVar2.d(i12);
                return;
            default:
                f();
                int size3 = ((TreeMap) obj).size();
                if (size3 == 0) {
                    i10 = 0;
                } else {
                    i10 = b();
                }
                if (size3 <= 65536) {
                    U4.c cVar3 = (U4.c) aVar;
                    if (cVar3.c()) {
                        cVar3.b(4, "type_ids_size:   ".concat(y.d1(size3)));
                        cVar3.b(4, "type_ids_off:    ".concat(y.d1(i10)));
                    }
                    cVar3.d(size3);
                    cVar3.d(i10);
                    return;
                }
                throw new N4.a(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(c().size()), 65536), null);
        }
    }
}
