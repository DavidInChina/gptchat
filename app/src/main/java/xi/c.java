package xi;

import io.sentry.C3636c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import q.C5241w;
import ti.f;
import ti.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f50071a;

    /* renamed from: b  reason: collision with root package name */
    public final List f50072b;

    /* renamed from: c  reason: collision with root package name */
    public final y7.b f50073c;

    /* renamed from: d  reason: collision with root package name */
    public final List f50074d;

    /* renamed from: e  reason: collision with root package name */
    public final a f50075e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(C5241w c5241w) {
        LinkedHashSet linkedHashSet = f.f46255r;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) c5241w.f43573a);
        for (Class cls : (Set) c5241w.f43576d) {
            arrayList.add(f.f46256s.get(cls));
        }
        this.f50071a = arrayList;
        y7.b bVar = (y7.b) c5241w.f43577e;
        this.f50073c = bVar == null ? new y7.b(23, c5241w) : bVar;
        this.f50074d = (List) c5241w.f43575c;
        List list = (List) c5241w.f43574b;
        this.f50072b = list;
        this.f50075e = (a) c5241w.f43578f;
        new LinkedHashMap();
        HashMap hashMap = new HashMap();
        l.b(Arrays.asList(new ui.a(0), new ui.a(1)), hashMap);
        l.b(list, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('\\', Collections.singletonList(new Object()));
        hashMap2.put('`', Collections.singletonList(new Object()));
        hashMap2.put('&', Collections.singletonList(new Object()));
        hashMap2.put('<', Arrays.asList(new Object(), new Object()));
        Set<Character> keySet = hashMap.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
    }

    public final wi.f a(String str) {
        if (str != null) {
            f fVar = new f(this.f50071a, this.f50073c, this.f50072b, this.f50075e);
            int i10 = 0;
            while (true) {
                int length = str.length();
                int i11 = i10;
                while (true) {
                    if (i11 < length) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    break;
                }
                fVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                fVar.i(str.substring(i10));
            }
            fVar.f(fVar.f46272p.size());
            C3636c1 c3636c1 = new C3636c1(fVar.f46268l, 27, fVar.f46271o);
            fVar.f46267k.getClass();
            l lVar = new l(c3636c1);
            Iterator it = fVar.f46273q.iterator();
            while (it.hasNext()) {
                ((yi.a) it.next()).h(lVar);
            }
            wi.f fVar2 = (wi.f) fVar.f46270n.f46241b;
            for (oi.b bVar : this.f50074d) {
                bVar.getClass();
                oi.a aVar = new oi.a(bVar);
                fVar2.getClass();
                aVar.Y0(fVar2);
            }
            return fVar2;
        }
        throw new NullPointerException("input must not be null");
    }
}
