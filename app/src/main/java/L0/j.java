package L0;

import Ng.H;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.AbstractC3953c;
import wf.AbstractC6216a;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class j implements v, Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedHashMap f10409Y = new LinkedHashMap();

    /* renamed from: Z  reason: collision with root package name */
    public boolean f10410Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10411h0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3557B.K(this.f10409Y, jVar.f10409Y) && this.f10410Z == jVar.f10410Z && this.f10411h0 == jVar.f10411h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f10409Y.hashCode() * 31;
        int i11 = 1237;
        if (this.f10410Z) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f10411h0) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10409Y.entrySet().iterator();
    }

    public final Object r(u uVar) {
        Object obj = this.f10409Y.get(uVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + uVar + " - consider getOrElse or getOrNull");
    }

    public final Object s(u uVar, AbstractC6216a abstractC6216a) {
        Object obj = this.f10409Y.get(uVar);
        if (obj == null) {
            return abstractC6216a.mo122invoke();
        }
        return obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f10410Z) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f10411h0) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f10409Y.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(((u) entry.getKey()).f10473a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return H.u(this) + "{ " + ((Object) sb2) + " }";
    }

    public final void y(u uVar, Object obj) {
        boolean z10 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f10409Y;
        if (z10 && linkedHashMap.containsKey(uVar)) {
            Object obj2 = linkedHashMap.get(uVar);
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", obj2);
            a aVar = (a) obj2;
            a aVar2 = (a) obj;
            String str = aVar2.f10368a;
            if (str == null) {
                str = aVar.f10368a;
            }
            AbstractC3953c abstractC3953c = aVar2.f10369b;
            if (abstractC3953c == null) {
                abstractC3953c = aVar.f10369b;
            }
            linkedHashMap.put(uVar, new a(str, abstractC3953c));
            return;
        }
        linkedHashMap.put(uVar, obj);
    }
}
