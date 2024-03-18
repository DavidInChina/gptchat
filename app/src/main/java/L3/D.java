package L3;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f10680a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.q f10681b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f10682c;

    public D(UUID uuid, U3.q qVar, Set set) {
        AbstractC3557B.c0(ParameterNames.ID, uuid);
        AbstractC3557B.c0("workSpec", qVar);
        AbstractC3557B.c0("tags", set);
        this.f10680a = uuid;
        this.f10681b = qVar;
        this.f10682c = set;
    }
}
