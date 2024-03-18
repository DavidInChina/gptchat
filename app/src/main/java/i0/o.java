package i0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f32430a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f32431b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f32432c;

    public o(Map map, wf.k kVar) {
        LinkedHashMap linkedHashMap;
        this.f32430a = kVar;
        if (map != null) {
            linkedHashMap = AbstractC4268D.m1(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.f32431b = linkedHashMap;
        this.f32432c = new LinkedHashMap();
    }

    @Override // i0.m
    public final boolean a(Object obj) {
        return ((Boolean) this.f32430a.invoke(obj)).booleanValue();
    }

    @Override // i0.m
    public final Map b() {
        LinkedHashMap m12 = AbstractC4268D.m1(this.f32431b);
        for (Map.Entry entry : this.f32432c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object mo122invoke = ((AbstractC6216a) list.get(0)).mo122invoke();
                if (mo122invoke == null) {
                    continue;
                } else if (a(mo122invoke)) {
                    m12.put(str, AbstractC4344b.M(mo122invoke));
                } else {
                    throw new IllegalStateException("item can't be saved".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object mo122invoke2 = ((AbstractC6216a) list.get(i10)).mo122invoke();
                    if (mo122invoke2 != null && !a(mo122invoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(mo122invoke2);
                }
                m12.put(str, arrayList);
            }
        }
        return m12;
    }

    @Override // i0.m
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f32431b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null && (!list.isEmpty())) {
            if (list.size() > 1) {
                linkedHashMap.put(str, list.subList(1, list.size()));
            }
            return list.get(0);
        }
        return null;
    }

    @Override // i0.m
    public final l d(String str, AbstractC6216a abstractC6216a) {
        if (!Lg.n.n2(str)) {
            LinkedHashMap linkedHashMap = this.f32432c;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(abstractC6216a);
            return new n(this, str, abstractC6216a);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
