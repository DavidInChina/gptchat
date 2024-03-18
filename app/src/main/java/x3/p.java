package x3;

import android.os.RemoteException;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f48712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f48713b;

    public p(s sVar, String[] strArr) {
        this.f48713b = sVar;
        this.f48712a = strArr;
    }

    public final void a(Set set) {
        AbstractC3557B.c0("tables", set);
        s sVar = this.f48713b;
        if (sVar.f48725h.get()) {
            return;
        }
        try {
            k kVar = sVar.f48723f;
            if (kVar != null) {
                int i10 = sVar.f48721d;
                Object[] array = set.toArray(new String[0]);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>", array);
                kVar.i(i10, (String[]) array);
            }
        } catch (RemoteException e10) {
            AbstractC3612c.s("ROOM", "Cannot broadcast invalidation", e10);
        }
    }
}
