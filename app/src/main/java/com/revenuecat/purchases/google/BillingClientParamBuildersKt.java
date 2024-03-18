package com.revenuecat.purchases.google;

import K4.C0813a;
import K4.u;
import K4.v;
import K4.w;
import K4.x;
import U3.l;
import com.google.android.gms.internal.play_billing.AbstractC2446f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"", "LK4/w;", "buildQueryPurchaseHistoryParams", "(Ljava/lang/String;)LK4/w;", "LK4/x;", "buildQueryPurchasesParams", "(Ljava/lang/String;)LK4/x;", "", "productIds", "LK4/v;", "buildQueryProductDetailsParams", "(Ljava/lang/String;Ljava/util/Set;)LK4/v;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BillingClientParamBuildersKt {
    public static final v buildQueryProductDetailsParams(String str, Set<String> set) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("productIds", set);
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(set2, 10));
        for (String str2 : set2) {
            l lVar = new l(0);
            lVar.f17423Z = str2;
            lVar.f17424h0 = str;
            if (!"first_party".equals(str)) {
                if (((String) lVar.f17423Z) != null) {
                    if (((String) lVar.f17424h0) != null) {
                        arrayList.add(new u(lVar));
                    } else {
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                } else {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
            } else {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
        }
        F4.a aVar = new F4.a((Object) null);
        if (!arrayList.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (!"play_pass_subs".equals(uVar.f9471b)) {
                    hashSet.add(uVar.f9471b);
                }
            }
            if (hashSet.size() <= 1) {
                aVar.f5033Z = AbstractC2446f.U(arrayList);
                return new v(aVar);
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        throw new IllegalArgumentException("Product list cannot be empty.");
    }

    public static final w buildQueryPurchaseHistoryParams(String str) {
        AbstractC3557B.c0("<this>", str);
        if (AbstractC3557B.K(str, "inapp") || AbstractC3557B.K(str, "subs")) {
            C0813a c0813a = new C0813a(2);
            c0813a.f9398Z = str;
            return new w(c0813a);
        }
        return null;
    }

    public static final x buildQueryPurchasesParams(String str) {
        AbstractC3557B.c0("<this>", str);
        if (AbstractC3557B.K(str, "inapp") || AbstractC3557B.K(str, "subs")) {
            Q1.u uVar = new Q1.u(3);
            uVar.f14350Z = str;
            return new x(uVar);
        }
        return null;
    }
}
