package L8;

import I8.E;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j extends E {

    /* renamed from: a  reason: collision with root package name */
    public final w f10801a;

    /* renamed from: b  reason: collision with root package name */
    public final w f10802b;

    /* renamed from: c  reason: collision with root package name */
    public final K8.n f10803c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f10804d;

    public j(k kVar, I8.n nVar, Type type, E e10, Type type2, E e11, K8.n nVar2) {
        this.f10804d = kVar;
        this.f10801a = new w(nVar, e10, type);
        this.f10802b = new w(nVar, e11, type2);
        this.f10803c = nVar2;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        int R02 = bVar.R0();
        if (R02 == 9) {
            bVar.A0();
            return null;
        }
        Map map = (Map) this.f10803c.i();
        w wVar = this.f10802b;
        w wVar2 = this.f10801a;
        if (R02 == 1) {
            bVar.a();
            while (bVar.P()) {
                bVar.a();
                Object b10 = wVar2.b(bVar);
                if (map.put(b10, wVar.b(bVar)) == null) {
                    bVar.k();
                } else {
                    throw new RuntimeException("duplicate key: " + b10);
                }
            }
            bVar.k();
        } else {
            bVar.h();
            while (bVar.P()) {
                P8.a.f13849a.getClass();
                P8.a.a(bVar);
                Object b11 = wVar2.b(bVar);
                if (map.put(b11, wVar.b(bVar)) != null) {
                    throw new RuntimeException("duplicate key: " + b11);
                }
            }
            bVar.m();
        }
        return map;
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        String str;
        boolean z10;
        Map map = (Map) obj;
        if (map == null) {
            cVar.F();
            return;
        }
        boolean z11 = this.f10804d.f10806Z;
        w wVar = this.f10802b;
        if (!z11) {
            cVar.i();
            for (Map.Entry entry : map.entrySet()) {
                cVar.p(String.valueOf(entry.getKey()));
                wVar.c(cVar, entry.getValue());
            }
            cVar.m();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i10 = 0;
        boolean z12 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            w wVar2 = this.f10801a;
            wVar2.getClass();
            try {
                i iVar = new i();
                wVar2.c(iVar, key);
                ArrayList arrayList3 = iVar.f10798r0;
                if (arrayList3.isEmpty()) {
                    I8.r rVar = iVar.f10800t0;
                    arrayList.add(rVar);
                    arrayList2.add(entry2.getValue());
                    rVar.getClass();
                    if (!(rVar instanceof I8.p) && !(rVar instanceof I8.u)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 |= z10;
                } else {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        if (z12) {
            cVar.h();
            int size = arrayList.size();
            while (i10 < size) {
                cVar.h();
                K8.d.V0((I8.r) arrayList.get(i10), cVar);
                wVar.c(cVar, arrayList2.get(i10));
                cVar.k();
                i10++;
            }
            cVar.k();
            return;
        }
        cVar.i();
        int size2 = arrayList.size();
        while (i10 < size2) {
            I8.r rVar2 = (I8.r) arrayList.get(i10);
            rVar2.getClass();
            boolean z13 = rVar2 instanceof I8.w;
            if (z13) {
                if (z13) {
                    I8.w wVar3 = (I8.w) rVar2;
                    Serializable serializable = wVar3.f8134Y;
                    if (serializable instanceof Number) {
                        str = String.valueOf(wVar3.M());
                    } else if (serializable instanceof Boolean) {
                        str = Boolean.toString(wVar3.f());
                    } else if (serializable instanceof String) {
                        str = wVar3.T();
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw new IllegalStateException("Not a JSON Primitive: " + rVar2);
                }
            } else if (rVar2 instanceof I8.t) {
                str = "null";
            } else {
                throw new AssertionError();
            }
            cVar.p(str);
            wVar.c(cVar, arrayList2.get(i10));
            i10++;
        }
        cVar.m();
    }
}
