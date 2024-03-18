package Uc;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Uc.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1438x extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public final String f17700i;

    /* renamed from: j  reason: collision with root package name */
    public final String f17701j;

    /* renamed from: k  reason: collision with root package name */
    public final List f17702k = AbstractC4344b.F0(r9.y.N0(ParameterNames.ID, C1417b.f17660x0));

    public AbstractC1438x(String str) {
        this.f17700i = str;
        this.f17701j = str.concat("/{id}");
    }

    public static String o1(androidx.lifecycle.P p10) {
        Object b10 = p10.b(ParameterNames.ID);
        if (b10 != null) {
            return (String) b10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // Ad.l
    public final List n0() {
        return this.f17702k;
    }

    public final String p1(String str) {
        AbstractC3557B.c0("gizmoId", str);
        String str2 = this.f17700i + Separators.SLASH + str;
        AbstractC3557B.c0("internalRoute", str2);
        return str2;
    }

    @Override // Ad.l
    public final String x0() {
        return this.f17701j;
    }
}
