package com.revenuecat.purchases.google;

import K4.AbstractC0815c;
import K4.C0816d;
import K4.C0820h;
import K4.C0821i;
import K4.C0822j;
import K4.F;
import K4.G;
import K4.H;
import K4.q;
import K4.y;
import U3.u;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC2446f;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.s1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.BillingStrings;
import id.AbstractC3557B;
import j.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingWrapper$launchBillingFlow$1 extends o implements k {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ C0821i $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$launchBillingFlow$1(Activity activity, C0821i c0821i) {
        super(1);
        this.$activity = activity;
        this.$params = c0821i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:51|(35:53|(1:55)(2:56|(1:58))|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(1:82)|(1:84)(1:85)|(1:87)|88|(2:90|(5:92|(1:94)|95|(2:97|(1:99)(2:101|102))(1:103)|100)(2:104|105))(9:106|(7:109|(1:111)|112|(1:114)|(2:116|203)(1:204)|117|107)|202|118|(1:120)|121|(1:123)|124|(1:126))|127|(2:129|(1:131)(5:132|10|190|(1:192)|(2:194|195)(1:205)))(1:133)|134|(1:136)(1:138)|137|139|(1:141)|142|(1:144)(2:145|(6:147|199|148|149|197|150))|153|(2:159|(2:163|(2:165|167)(1:166))(1:162))(1:157)|158|167)(1:168)|201|(1:170)(5:178|(3:180|(1:182)|183)(2:184|185)|190|(0)|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x040f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0411, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0414, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0473, code lost:
        com.google.android.gms.internal.play_billing.AbstractC2468q.f(r7, "Exception while launching billing flow. Try to reconnect", r0);
        r0 = r5.f9404f;
        r1 = K4.H.f9361j;
        ((U3.u) r0).S(K4.F.b(5, r4, r1));
        r5.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x048a, code lost:
        com.google.android.gms.internal.play_billing.AbstractC2468q.f(r7, "Time out while launching billing flow. Try to reconnect", r0);
        r0 = r5.f9404f;
        r1 = K4.H.f9362k;
        ((U3.u) r0).S(K4.F.b(r3, r4, r1));
        r5.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r10.f9438g == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(AbstractC0815c abstractC0815c) {
        C0822j c0822j;
        C0822j c0822j2;
        C0822j c0822j3;
        Activity activity;
        String str;
        String str2;
        C0816d c0816d;
        int i10;
        int i11;
        int i12;
        Future future;
        boolean z10;
        C0820h c0820h;
        String str3;
        String str4;
        String str5;
        C0821i c0821i;
        String str6;
        C0820h c0820h2;
        boolean z11;
        String str7;
        final int i13;
        int i14;
        String str8;
        C0822j c0822j4;
        C0822j c0822j5;
        AbstractC3557B.c0("$this$withConnectedClient", abstractC0815c);
        Activity activity2 = this.$activity;
        C0821i c0821i2 = this.$params;
        final C0816d c0816d2 = (C0816d) abstractC0815c;
        if (c0816d2.f9402d != null && c0816d2.f9402d.f9392b != null) {
            if (!c0816d2.c()) {
                G g10 = c0816d2.f9404f;
                c0822j5 = H.f9361j;
                ((u) g10).S(F.b(2, 2, c0822j5));
                c0816d2.g(c0822j5);
            } else {
                c0821i2.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0821i2.f9437f);
                AbstractC2446f abstractC2446f = c0821i2.f9436e;
                Iterator it = arrayList.iterator();
                AbstractC2469q0.p(it.hasNext() ? it.next() : null);
                Iterator<E> it2 = abstractC2446f.iterator();
                C0820h c0820h3 = (C0820h) (it2.hasNext() ? it2.next() : null);
                q qVar = c0820h3.f9430a;
                String str9 = qVar.f9461c;
                String str10 = qVar.f9462d;
                if (str10.equals("subs") && !c0816d2.f9407i) {
                    AbstractC2468q.e("BillingClient", "Current client doesn't support subscriptions.");
                    G g11 = c0816d2.f9404f;
                    c0822j5 = H.f9363l;
                    ((u) g11).S(F.b(9, 2, c0822j5));
                    c0816d2.g(c0822j5);
                } else {
                    if (c0821i2.f9433b == null && c0821i2.f9434c == null) {
                        j jVar = c0821i2.f9435d;
                        if (((String) jVar.f35820i0) == null) {
                            if (jVar.f35817Y == 0) {
                                if (jVar.f35818Z == 0) {
                                    if (!c0821i2.f9432a) {
                                    }
                                }
                            }
                        }
                    }
                    if (!c0816d2.f9410l) {
                        c0822j2 = null;
                        AbstractC2468q.e("BillingClient", "Current client doesn't support extra params for buy intent.");
                        G g12 = c0816d2.f9404f;
                        c0822j3 = H.f9357f;
                        ((u) g12).S(F.b(18, 2, c0822j3));
                        c0816d2.g(c0822j3);
                    }
                    if (arrayList.size() > 1 && !c0816d2.f9416r) {
                        AbstractC2468q.e("BillingClient", "Current client doesn't support multi-item purchases.");
                        G g13 = c0816d2.f9404f;
                        c0822j4 = H.f9368q;
                        ((u) g13).S(F.b(19, 2, c0822j4));
                        c0816d2.g(c0822j4);
                    } else if (!abstractC2446f.isEmpty() && !c0816d2.f9417s) {
                        AbstractC2468q.e("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                        G g14 = c0816d2.f9404f;
                        c0822j4 = H.f9370s;
                        ((u) g14).S(F.b(20, 2, c0822j4));
                        c0816d2.g(c0822j4);
                    } else {
                        if (!c0816d2.f9410l) {
                            str = "BUY_INTENT";
                            activity = activity2;
                            str2 = "BillingClient";
                            i10 = 2;
                            c0816d = c0816d2;
                            c0822j2 = null;
                            i11 = 4;
                            future = c0816d.j(new y(c0816d, str9, str10, 4), 5000L, null, c0816d.f9401c);
                            i12 = 80;
                        } else {
                            boolean z12 = c0816d2.f9412n;
                            boolean z13 = c0816d2.f9423y;
                            String str11 = c0816d2.f9400b;
                            final Bundle bundle = new Bundle();
                            bundle.putString("playBillingLibraryVersion", str11);
                            j jVar2 = c0821i2.f9435d;
                            int i15 = jVar2.f35818Z;
                            str = "BUY_INTENT";
                            if (i15 != 0) {
                                bundle.putInt("prorationMode", i15);
                            } else {
                                int i16 = jVar2.f35817Y;
                                if (i16 != 0) {
                                    bundle.putInt("prorationMode", i16);
                                }
                            }
                            if (!TextUtils.isEmpty(c0821i2.f9433b)) {
                                bundle.putString("accountId", c0821i2.f9433b);
                            }
                            if (!TextUtils.isEmpty(c0821i2.f9434c)) {
                                bundle.putString("obfuscatedProfileId", c0821i2.f9434c);
                            }
                            if (c0821i2.f9438g) {
                                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                            }
                            if (!TextUtils.isEmpty((String) c0821i2.f9435d.f35819h0)) {
                                bundle.putString("oldSkuPurchaseToken", (String) c0821i2.f9435d.f35819h0);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putString("oldSkuPurchaseId", null);
                            }
                            if (!TextUtils.isEmpty((String) c0821i2.f9435d.f35820i0)) {
                                bundle.putString("originalExternalTransactionId", (String) c0821i2.f9435d.f35820i0);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putString("paymentsPurchaseParams", null);
                            }
                            if (z12) {
                                z10 = true;
                                bundle.putBoolean("enablePendingPurchases", true);
                            } else {
                                z10 = true;
                            }
                            if (z13) {
                                bundle.putBoolean("enableAlternativeBilling", z10);
                            }
                            if (!arrayList.isEmpty()) {
                                ArrayList<String> arrayList2 = new ArrayList<>();
                                new ArrayList();
                                new ArrayList();
                                new ArrayList();
                                new ArrayList();
                                Iterator it3 = arrayList.iterator();
                                if (!it3.hasNext()) {
                                    if (!arrayList2.isEmpty()) {
                                        bundle.putStringArrayList("skuDetailsTokens", arrayList2);
                                    }
                                    if (arrayList.size() > 1) {
                                        ArrayList<String> arrayList3 = new ArrayList<>(arrayList.size() - 1);
                                        c0821i = c0821i2;
                                        ArrayList<String> arrayList4 = new ArrayList<>(arrayList.size() - 1);
                                        str5 = str10;
                                        if (1 >= arrayList.size()) {
                                            bundle.putStringArrayList("additionalSkus", arrayList3);
                                            bundle.putStringArrayList("additionalSkuTypes", arrayList4);
                                        } else {
                                            AbstractC2469q0.p(arrayList.get(1));
                                            throw null;
                                        }
                                    } else {
                                        str5 = str10;
                                        c0821i = c0821i2;
                                    }
                                    activity = activity2;
                                    str4 = "proxyPackageVersion";
                                    c0820h = c0820h3;
                                    str6 = str9;
                                    str3 = "BillingClient";
                                } else {
                                    AbstractC2469q0.p(it3.next());
                                    throw null;
                                }
                            } else {
                                str5 = str10;
                                c0821i = c0821i2;
                                ArrayList<String> arrayList5 = new ArrayList<>(abstractC2446f.size() - 1);
                                ArrayList<String> arrayList6 = new ArrayList<>(abstractC2446f.size() - 1);
                                ArrayList<String> arrayList7 = new ArrayList<>();
                                ArrayList<String> arrayList8 = new ArrayList<>();
                                str6 = str9;
                                ArrayList<String> arrayList9 = new ArrayList<>();
                                str4 = "proxyPackageVersion";
                                str3 = "BillingClient";
                                int i17 = 0;
                                while (i17 < abstractC2446f.size()) {
                                    C0820h c0820h4 = (C0820h) abstractC2446f.get(i17);
                                    Activity activity3 = activity2;
                                    q qVar2 = c0820h4.f9430a;
                                    C0820h c0820h5 = c0820h3;
                                    if (!qVar2.f9466h.isEmpty()) {
                                        arrayList7.add(qVar2.f9466h);
                                    }
                                    arrayList8.add(c0820h4.f9431b);
                                    if (!TextUtils.isEmpty(qVar2.f9467i)) {
                                        arrayList9.add(qVar2.f9467i);
                                    }
                                    if (i17 > 0) {
                                        arrayList5.add(((C0820h) abstractC2446f.get(i17)).f9430a.f9461c);
                                        arrayList6.add(((C0820h) abstractC2446f.get(i17)).f9430a.f9462d);
                                    }
                                    i17++;
                                    activity2 = activity3;
                                    c0820h3 = c0820h5;
                                }
                                activity = activity2;
                                c0820h = c0820h3;
                                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                                if (!arrayList7.isEmpty()) {
                                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                                }
                                if (!arrayList9.isEmpty()) {
                                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                                }
                                if (!arrayList5.isEmpty()) {
                                    bundle.putStringArrayList("additionalSkus", arrayList5);
                                    bundle.putStringArrayList("additionalSkuTypes", arrayList6);
                                }
                            }
                            if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST")) {
                                i10 = 2;
                                c0820h2 = c0820h;
                            } else if (!c0816d2.f9414p) {
                                G g15 = c0816d2.f9404f;
                                C0822j c0822j6 = H.f9369r;
                                ((u) g15).S(F.b(21, 2, c0822j6));
                                c0816d2.g(c0822j6);
                                c0822j = c0822j6;
                                c0822j2 = null;
                                if (c0822j.f9439a == 0) {
                                    c0822j = c0822j2;
                                }
                                if (c0822j == null) {
                                    return;
                                }
                                AbstractC2469q0.t(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(c0822j)}, 1, BillingStrings.BILLING_INTENT_FAILED, LogIntent.GOOGLE_ERROR);
                                return;
                            } else {
                                c0820h2 = c0820h;
                                i10 = 2;
                            }
                            if (!TextUtils.isEmpty(c0820h2.f9430a.f9460b.optString("packageName"))) {
                                bundle.putString("skuPackageName", c0820h2.f9430a.f9460b.optString("packageName"));
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c0822j2 = null;
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putString("accountName", null);
                            }
                            Intent intent = activity.getIntent();
                            if (intent == null) {
                                str7 = str3;
                                AbstractC2468q.e(str7, "Activity's intent is null.");
                            } else {
                                str7 = str3;
                                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                    bundle.putString("proxyPackage", stringExtra);
                                    try {
                                        str8 = str4;
                                        try {
                                            bundle.putString(str8, c0816d2.f9403e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                        } catch (PackageManager.NameNotFoundException unused) {
                                            bundle.putString(str8, "package not found");
                                            if (!c0816d2.f9417s) {
                                            }
                                            if (!c0816d2.f9415q) {
                                            }
                                            if (!c0816d2.f9412n) {
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        str8 = str4;
                                    }
                                }
                            }
                            if (!c0816d2.f9417s && !abstractC2446f.isEmpty()) {
                                i14 = 17;
                            } else if (!c0816d2.f9415q && z11) {
                                i14 = 15;
                            } else if (!c0816d2.f9412n) {
                                i13 = 9;
                                final String str12 = str6;
                                final String str13 = str5;
                                final C0821i c0821i3 = c0821i;
                                i11 = 4;
                                str2 = str7;
                                c0816d = c0816d2;
                                future = c0816d2.j(new Callable(i13, str12, str13, c0821i3, bundle) { // from class: K4.A

                                    /* renamed from: b  reason: collision with root package name */
                                    public final /* synthetic */ int f9334b;

                                    /* renamed from: c  reason: collision with root package name */
                                    public final /* synthetic */ String f9335c;

                                    /* renamed from: d  reason: collision with root package name */
                                    public final /* synthetic */ String f9336d;

                                    /* renamed from: e  reason: collision with root package name */
                                    public final /* synthetic */ Bundle f9337e;

                                    {
                                        this.f9337e = bundle;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        C0816d c0816d3 = C0816d.this;
                                        int i18 = this.f9334b;
                                        String str14 = this.f9335c;
                                        String str15 = this.f9336d;
                                        Bundle bundle2 = this.f9337e;
                                        q1 q1Var = c0816d3.f9405g;
                                        String packageName = c0816d3.f9403e.getPackageName();
                                        o1 o1Var = (o1) q1Var;
                                        Parcel j6 = o1Var.j();
                                        j6.writeInt(i18);
                                        j6.writeString(packageName);
                                        j6.writeString(str14);
                                        j6.writeString(str15);
                                        j6.writeString(null);
                                        int i19 = s1.f26973a;
                                        j6.writeInt(1);
                                        bundle2.writeToParcel(j6, 0);
                                        Parcel k10 = o1Var.k(j6, 8);
                                        Bundle bundle3 = (Bundle) s1.a(k10, Bundle.CREATOR);
                                        k10.recycle();
                                        return bundle3;
                                    }
                                }, 5000L, null, c0816d2.f9401c);
                                i12 = 78;
                            } else {
                                i14 = 6;
                            }
                            i13 = i14;
                            final String str122 = str6;
                            final String str132 = str5;
                            final C0821i c0821i32 = c0821i;
                            i11 = 4;
                            str2 = str7;
                            c0816d = c0816d2;
                            future = c0816d2.j(new Callable(i13, str122, str132, c0821i32, bundle) { // from class: K4.A

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ int f9334b;

                                /* renamed from: c  reason: collision with root package name */
                                public final /* synthetic */ String f9335c;

                                /* renamed from: d  reason: collision with root package name */
                                public final /* synthetic */ String f9336d;

                                /* renamed from: e  reason: collision with root package name */
                                public final /* synthetic */ Bundle f9337e;

                                {
                                    this.f9337e = bundle;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C0816d c0816d3 = C0816d.this;
                                    int i18 = this.f9334b;
                                    String str14 = this.f9335c;
                                    String str15 = this.f9336d;
                                    Bundle bundle2 = this.f9337e;
                                    q1 q1Var = c0816d3.f9405g;
                                    String packageName = c0816d3.f9403e.getPackageName();
                                    o1 o1Var = (o1) q1Var;
                                    Parcel j6 = o1Var.j();
                                    j6.writeInt(i18);
                                    j6.writeString(packageName);
                                    j6.writeString(str14);
                                    j6.writeString(str15);
                                    j6.writeString(null);
                                    int i19 = s1.f26973a;
                                    j6.writeInt(1);
                                    bundle2.writeToParcel(j6, 0);
                                    Parcel k10 = o1Var.k(j6, 8);
                                    Bundle bundle3 = (Bundle) s1.a(k10, Bundle.CREATOR);
                                    k10.recycle();
                                    return bundle3;
                                }
                            }, 5000L, null, c0816d2.f9401c);
                            i12 = 78;
                        }
                        if (future == null) {
                            G g16 = c0816d.f9404f;
                            c0822j3 = H.f9361j;
                            ((u) g16).S(F.b(25, i10, c0822j3));
                            c0816d.g(c0822j3);
                        } else {
                            Bundle bundle2 = (Bundle) future.get(5000L, TimeUnit.MILLISECONDS);
                            int a5 = AbstractC2468q.a(bundle2, str2);
                            String c10 = AbstractC2468q.c(bundle2, str2);
                            if (a5 != 0) {
                                AbstractC2468q.e(str2, "Unable to buy item, Error response code: " + a5);
                                C0822j a10 = H.a(a5, c10);
                                G g17 = c0816d.f9404f;
                                if (bundle2 != null) {
                                    i12 = 23;
                                }
                                ((u) g17).S(F.b(i12, i10, a10));
                                c0816d.g(a10);
                                c0822j = a10;
                            } else {
                                Activity activity4 = activity;
                                Intent intent2 = new Intent(activity4, ProxyBillingActivity.class);
                                String str14 = str;
                                intent2.putExtra(str14, (PendingIntent) bundle2.getParcelable(str14));
                                activity4.startActivity(intent2);
                                c0822j = H.f9360i;
                            }
                            if (c0822j.f9439a == 0) {
                            }
                            if (c0822j == null) {
                            }
                        }
                    }
                    c0822j = c0822j4;
                    c0822j2 = null;
                    if (c0822j.f9439a == 0) {
                    }
                    if (c0822j == null) {
                    }
                }
            }
            c0822j = c0822j5;
            c0822j2 = null;
            if (c0822j.f9439a == 0) {
            }
            if (c0822j == null) {
            }
        } else {
            c0822j2 = null;
            G g18 = c0816d2.f9404f;
            c0822j3 = H.f9351B;
            ((u) g18).S(F.b(12, 2, c0822j3));
        }
        c0822j = c0822j3;
        if (c0822j.f9439a == 0) {
        }
        if (c0822j == null) {
        }
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return jf.y.f36177a;
    }
}
