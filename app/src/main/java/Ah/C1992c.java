package ah;

import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: ah.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1992c extends C1999j {

    /* renamed from: Y  reason: collision with root package name */
    public final List f24196Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1992c(String str, C1992c c1992c, List list) {
        super(str, c1992c);
        AbstractC3557B.c0("missingFields", list);
        this.f24196Y = list;
    }

    public C1992c(String str) {
        this(android.gov.nist.core.a.A("Field '", str, "' is required, but it was missing"), null, AbstractC4344b.F0(str));
    }
}
