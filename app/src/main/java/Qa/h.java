package Qa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import kf.v;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@AbstractC1998i
/* loaded from: classes.dex */
public final class h<ID, T> {
    public static final g Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final PluginGeneratedSerialDescriptor f14553e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f14554a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14555b;

    /* renamed from: c  reason: collision with root package name */
    public final List f14556c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14557d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Qa.g] */
    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.TreeNode", null, 4);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("parent", true);
        pluginGeneratedSerialDescriptor.k("children", true);
        pluginGeneratedSerialDescriptor.k("content", false);
        f14553e = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ h(int i10, Object obj, Object obj2, List list, Object obj3) {
        if (9 != (i10 & 9)) {
            R4.b.e2(i10, 9, f14553e);
            throw null;
        }
        this.f14554a = obj;
        if ((i10 & 2) == 0) {
            this.f14555b = null;
        } else {
            this.f14555b = obj2;
        }
        if ((i10 & 4) == 0) {
            this.f14556c = v.f37483Y;
        } else {
            this.f14556c = list;
        }
        this.f14557d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    public static h a(h hVar, Object obj, ArrayList arrayList, C2969F c2969f, int i10) {
        if ((i10 & 2) != 0) {
            obj = hVar.f14555b;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 4) != 0) {
            arrayList2 = hVar.f14556c;
        }
        C2969F c2969f2 = c2969f;
        if ((i10 & 8) != 0) {
            c2969f2 = hVar.f14557d;
        }
        AbstractC3557B.c0("children", arrayList2);
        AbstractC3557B.c0("content", c2969f2);
        return new h(hVar.f14554a, obj, arrayList2, c2969f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f14554a, hVar.f14554a) && AbstractC3557B.K(this.f14555b, hVar.f14555b) && AbstractC3557B.K(this.f14556c, hVar.f14556c) && AbstractC3557B.K(this.f14557d, hVar.f14557d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f14554a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = i10 * 31;
        Object obj2 = this.f14555b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return this.f14557d.hashCode() + AbstractC4194d.s(this.f14556c, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        return "TreeNode(id=" + this.f14554a + ", parent=" + this.f14555b + ", children=" + this.f14556c + ", content=" + this.f14557d + Separators.RPAREN;
    }

    public h(Object obj, Object obj2, List list, Object obj3) {
        AbstractC3557B.c0("children", list);
        AbstractC3557B.c0("content", obj3);
        this.f14554a = obj;
        this.f14555b = obj2;
        this.f14556c = list;
        this.f14557d = obj3;
    }
}
