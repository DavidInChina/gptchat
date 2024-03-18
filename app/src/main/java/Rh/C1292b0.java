package Rh;

import java.util.List;

/* renamed from: Rh.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292b0 implements AbstractC1310k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15794a;

    /* renamed from: b  reason: collision with root package name */
    public final List f15795b;

    public C1292b0(String str, List list) {
        this.f15794a = str;
        this.f15795b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1292b0.class != obj.getClass()) {
            return false;
        }
        C1292b0 c1292b0 = (C1292b0) obj;
        if (this.f15794a.equals(c1292b0.f15794a) && this.f15795b.equals(c1292b0.f15795b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15795b.hashCode() + E9.f.v(this.f15794a, C1292b0.class.hashCode() * 31, 31);
    }
}
