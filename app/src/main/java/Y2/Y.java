package y2;

import E2.C0484p;
import E2.C0488u;
import E2.C0492y;
import N.C1025i;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import g5.C3200b;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import k5.C4180f;
import k5.C4185k;
import m.RunnableC4517N;
import z2.AbstractC6756a;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50500Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f50501Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50502h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50503i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f50504j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f50505k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f50506l0;

    public /* synthetic */ Y(Object obj, Object obj2, C0484p c0484p, C0488u c0488u, IOException iOException, boolean z10, int i10) {
        this.f50500Y = i10;
        this.f50505k0 = obj;
        this.f50506l0 = obj2;
        this.f50501Z = c0484p;
        this.f50502h0 = c0488u;
        this.f50503i0 = iOException;
        this.f50504j0 = z10;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [h5.c, java.lang.Object, g5.b] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f50500Y;
        Object obj = this.f50503i0;
        Object obj2 = this.f50502h0;
        Object obj3 = this.f50501Z;
        Object obj4 = this.f50506l0;
        Object obj5 = this.f50505k0;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj4;
                AbstractC6756a abstractC6756a = ((c0) ((U3.c) obj5).f17397h0).f50530h;
                int intValue = ((Integer) pair.first).intValue();
                C0492y c0492y = (C0492y) pair.second;
                z2.w wVar = (z2.w) abstractC6756a;
                wVar.t(intValue, c0492y, (C0484p) obj3, (C0488u) obj2, (IOException) obj, this.f50504j0);
                return;
            case 1:
                C1025i c1025i = (C1025i) obj5;
                ((E2.C) obj4).t(c1025i.f12350Z, (C0492y) c1025i.f12351h0, (C0484p) obj3, (C0488u) obj2, (IOException) obj, this.f50504j0);
                return;
            default:
                C4185k c4185k = (C4185k) obj5;
                Context context = (Context) obj4;
                Uri uri = (Uri) obj3;
                com.auth0.android.request.internal.m mVar = (com.auth0.android.request.internal.m) obj2;
                C4180f c4180f = (C4180f) obj;
                c4185k.getClass();
                try {
                    if (this.f50504j0) {
                        c4185k.f37073f.a(c4185k.f37074g.c(context, uri));
                    } else {
                        c4185k.c(context, uri);
                    }
                    return;
                } catch (ActivityNotFoundException unused) {
                    AbstractC3612c.c("k", "Could not find any Browser application installed in this device to handle the intent.");
                    return;
                } catch (SecurityException e10) {
                    ?? c3200b = new C3200b("An error occurred when trying to authenticate with the server.", e10);
                    c3200b.f31910Y = "a0.browser_not_available";
                    c3200b.f31911Z = "Error launching browser for authentication";
                    mVar.b(new RunnableC4517N(c4180f, 26, c3200b));
                    return;
                }
        }
    }

    public /* synthetic */ Y(C4185k c4185k, boolean z10, Context context, Uri uri, com.auth0.android.request.internal.c cVar, C4180f c4180f) {
        this.f50500Y = 2;
        this.f50505k0 = c4185k;
        this.f50504j0 = z10;
        this.f50506l0 = context;
        this.f50501Z = uri;
        this.f50502h0 = cVar;
        this.f50503i0 = c4180f;
    }
}
