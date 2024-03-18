package wh;

import java.util.Collections;
import java.util.List;
import sh.AbstractC5630b;
import sh.C5629a;
import th.h0;
import yh.G1;
import yh.Y0;
import yh.l1;
import yh.t1;

/* renamed from: wh.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6247l implements AbstractC5630b {

    /* renamed from: a  reason: collision with root package name */
    public final String f48550a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48551b;

    /* renamed from: c  reason: collision with root package name */
    public final List f48552c;

    /* renamed from: d  reason: collision with root package name */
    public final l1.a f48553d;

    /* renamed from: e  reason: collision with root package name */
    public final List f48554e;

    /* renamed from: f  reason: collision with root package name */
    public final List f48555f;

    /* renamed from: g  reason: collision with root package name */
    public final List f48556g;

    /* renamed from: h  reason: collision with root package name */
    public final h0 f48557h;

    /* renamed from: i  reason: collision with root package name */
    public final l1.a f48558i;

    /* renamed from: j  reason: collision with root package name */
    public transient /* synthetic */ int f48559j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6247l(String str, int i10, l1.a aVar) {
        this(str, i10, r4, aVar, r6, r7, r8, null, null);
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        C6260y c6260y = new C6260y(emptyList);
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        l1.a aVar2 = l1.a.f51045N;
    }

    /* renamed from: b */
    public final C6247l a(Y0 y02) {
        l1.a aVar;
        C5629a I10 = new C5629a(this.f48552c).I(y02);
        l1.a aVar2 = (l1.a) this.f48553d.k(y02);
        C5629a I11 = new C5629a(this.f48554e).I(y02);
        G1 k10 = new t1(this.f48555f).k(y02);
        l1.a aVar3 = this.f48558i;
        if (aVar3 == null) {
            l1.a aVar4 = l1.a.f51045N;
            aVar = null;
        } else {
            aVar = (l1.a) aVar3.k(y02);
        }
        l1.a aVar5 = aVar;
        return new C6247l(this.f48550a, this.f48551b, I10, aVar2, I11, k10, this.f48556g, this.f48557h, aVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6247l.class != obj.getClass()) {
            return false;
        }
        C6247l c6247l = (C6247l) obj;
        if (this.f48551b == c6247l.f48551b && this.f48550a.equals(c6247l.f48550a) && this.f48552c.equals(c6247l.f48552c) && this.f48553d.equals(c6247l.f48553d) && this.f48554e.equals(c6247l.f48554e) && this.f48555f.equals(c6247l.f48555f) && this.f48556g.equals(c6247l.f48556g)) {
            h0 h0Var = c6247l.f48557h;
            h0 h0Var2 = this.f48557h;
            if (h0Var2 == null ? h0Var == null : h0Var2.equals(h0Var)) {
                l1.a aVar = c6247l.f48558i;
                l1.a aVar2 = this.f48558i;
                if (aVar2 != null) {
                    if (aVar2.equals(aVar)) {
                        return true;
                    }
                } else if (aVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        if (this.f48559j == 0) {
            int hashCode = this.f48552c.hashCode();
            int hashCode2 = this.f48553d.hashCode();
            int hashCode3 = this.f48554e.hashCode();
            int hashCode4 = (this.f48556g.hashCode() + ((this.f48555f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((this.f48550a.hashCode() * 31) + this.f48551b) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            h0 h0Var = this.f48557h;
            if (h0Var != null) {
                i10 = h0Var.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (hashCode4 + i10) * 31;
            l1.a aVar = this.f48558i;
            if (aVar != null) {
                i11 = aVar.hashCode();
            }
            i11 += i12;
        }
        if (i11 == 0) {
            return this.f48559j;
        }
        this.f48559j = i11;
        return i11;
    }

    public final String toString() {
        return "MethodDescription.Token{name='" + this.f48550a + "', modifiers=" + this.f48551b + ", typeVariableTokens=" + this.f48552c + ", returnType=" + this.f48553d + ", parameterTokens=" + this.f48554e + ", exceptionTypes=" + this.f48555f + ", annotations=" + this.f48556g + ", defaultValue=" + this.f48557h + ", receiverType=" + this.f48558i + '}';
    }

    public C6247l(String str, int i10, List list, l1.a aVar, List list2, List list3, List list4, h0 h0Var, l1.a aVar2) {
        this.f48550a = str;
        this.f48551b = i10;
        this.f48552c = list;
        this.f48553d = aVar;
        this.f48554e = list2;
        this.f48555f = list3;
        this.f48556g = list4;
        this.f48557h = h0Var;
        this.f48558i = aVar2;
    }
}
