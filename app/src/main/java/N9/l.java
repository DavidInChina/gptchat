package n9;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class l extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final l f39688Y = new o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = ((C6182c0) obj).f48393Y;
        String str2 = ((C6168C) obj2).f48321a;
        Qa.h hVar = (Qa.h) obj3;
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("conversationId_", str2);
        AbstractC3557B.c0("messageNode", hVar);
        return new i(str, str2, hVar);
    }
}
