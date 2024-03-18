package id;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: id.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3556A {

    /* renamed from: a  reason: collision with root package name */
    public final Set f33075a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f33076b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f33077c;

    public C3556A(Set set, Set set2, Set set3) {
        AbstractC3557B.c0("selectedColumns", set);
        AbstractC3557B.c0("selectedRows", set2);
        AbstractC3557B.c0("selectedCells", set3);
        this.f33075a = set;
        this.f33076b = set2;
        this.f33077c = set3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    public static C3556A a(C3556A c3556a, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, Set set, int i10) {
        LinkedHashSet linkedHashSet3 = linkedHashSet;
        if ((i10 & 1) != 0) {
            linkedHashSet3 = c3556a.f33075a;
        }
        LinkedHashSet linkedHashSet4 = linkedHashSet2;
        if ((i10 & 2) != 0) {
            linkedHashSet4 = c3556a.f33076b;
        }
        AbstractC3557B.c0("selectedColumns", linkedHashSet3);
        AbstractC3557B.c0("selectedRows", linkedHashSet4);
        return new C3556A(linkedHashSet3, linkedHashSet4, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3556A)) {
            return false;
        }
        C3556A c3556a = (C3556A) obj;
        if (AbstractC3557B.K(this.f33075a, c3556a.f33075a) && AbstractC3557B.K(this.f33076b, c3556a.f33076b) && AbstractC3557B.K(this.f33077c, c3556a.f33077c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f33076b.hashCode();
        return this.f33077c.hashCode() + ((hashCode + (this.f33075a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SpreadsheetSelectionState(selectedColumns=" + this.f33075a + ", selectedRows=" + this.f33076b + ", selectedCells=" + this.f33077c + Separators.RPAREN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3556A() {
        this(r0, r0, r0);
        kf.x xVar = kf.x.f37485Y;
    }
}
