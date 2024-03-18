package P1;

import id.AbstractC3557B;
import java.util.Map;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class a extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f13774Y = new o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC3557B.c0("entry", entry);
        return "  " + ((f) entry.getKey()).f13782a + " = " + entry.getValue();
    }
}
