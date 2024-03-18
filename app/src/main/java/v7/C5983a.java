package v7;

import java.util.Arrays;
import u7.AbstractC5846b;

/* renamed from: v7.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5983a {

    /* renamed from: a  reason: collision with root package name */
    public final int f47288a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.u f47289b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5846b f47290c;

    /* renamed from: d  reason: collision with root package name */
    public final String f47291d;

    public C5983a(U3.u uVar, AbstractC5846b abstractC5846b, String str) {
        this.f47289b = uVar;
        this.f47290c = abstractC5846b;
        this.f47291d = str;
        this.f47288a = Arrays.hashCode(new Object[]{uVar, abstractC5846b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5983a)) {
            return false;
        }
        C5983a c5983a = (C5983a) obj;
        if (!M3.H.P(this.f47289b, c5983a.f47289b) || !M3.H.P(this.f47290c, c5983a.f47290c) || !M3.H.P(this.f47291d, c5983a.f47291d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f47288a;
    }
}
