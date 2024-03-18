package K4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.AbstractC2446f;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.C2442d;
import com.google.android.gms.internal.play_billing.C2454j;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.s1;
import io.sentry.C3636c1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import m.C4528h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9475a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0816d f9476b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9477c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f9478d;

    public /* synthetic */ y(C0816d c0816d, Object obj, Object obj2, int i10) {
        this.f9475a = i10;
        this.f9476b = c0816d;
        this.f9477c = obj;
        this.f9478d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x05d6, code lost:
        r3 = "Item is unavailable for purchase.";
        r14 = 4;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        U3.e eVar;
        String str2;
        Bundle bundle;
        int i16;
        C3636c1 c3636c1;
        String str3 = "enablePendingPurchases";
        String str4 = "";
        String str5 = "Continuation token: ";
        String str6 = "playBillingLibraryVersion";
        switch (this.f9475a) {
            case 0:
                C0816d c0816d = this.f9476b;
                com.revenuecat.purchases.google.usecase.a aVar = (com.revenuecat.purchases.google.usecase.a) this.f9478d;
                c0816d.getClass();
                String c10 = ((C0813a) this.f9477c).c();
                try {
                    AbstractC2468q.d("BillingClient", "Consuming purchase with token: " + c10);
                    if (c0816d.f9412n) {
                        q1 q1Var = c0816d.f9405g;
                        String packageName = c0816d.f9403e.getPackageName();
                        boolean z10 = c0816d.f9412n;
                        String str7 = c0816d.f9400b;
                        Bundle bundle2 = new Bundle();
                        if (z10) {
                            bundle2.putString(str6, str7);
                        }
                        o1 o1Var = (o1) q1Var;
                        Parcel j6 = o1Var.j();
                        j6.writeInt(9);
                        j6.writeString(packageName);
                        j6.writeString(c10);
                        int i17 = s1.f26973a;
                        j6.writeInt(1);
                        bundle2.writeToParcel(j6, 0);
                        Parcel k10 = o1Var.k(j6, 12);
                        Bundle bundle3 = (Bundle) s1.a(k10, Bundle.CREATOR);
                        k10.recycle();
                        i10 = bundle3.getInt("RESPONSE_CODE");
                        str = AbstractC2468q.c(bundle3, "BillingClient");
                    } else {
                        q1 q1Var2 = c0816d.f9405g;
                        String packageName2 = c0816d.f9403e.getPackageName();
                        o1 o1Var2 = (o1) q1Var2;
                        Parcel j10 = o1Var2.j();
                        j10.writeInt(3);
                        j10.writeString(packageName2);
                        j10.writeString(c10);
                        Parcel k11 = o1Var2.k(j10, 5);
                        int readInt = k11.readInt();
                        k11.recycle();
                        i10 = readInt;
                        str = str4;
                    }
                    C0822j a5 = H.a(i10, str);
                    if (i10 == 0) {
                        AbstractC2468q.d("BillingClient", "Successfully consumed purchase.");
                        aVar.d(a5, c10);
                    } else {
                        AbstractC2468q.e("BillingClient", "Error consuming purchase with token. Response code: " + i10);
                        ((U3.u) c0816d.f9404f).S(F.b(23, 4, a5));
                        aVar.d(a5, c10);
                    }
                } catch (Exception e10) {
                    AbstractC2468q.f("BillingClient", "Error consuming purchase!", e10);
                    G g10 = c0816d.f9404f;
                    C0822j c0822j = H.f9361j;
                    ((U3.u) g10).S(F.b(29, 4, c0822j));
                    aVar.d(c0822j, c10);
                }
                return null;
            case 1:
                C0816d c0816d2 = this.f9476b;
                v vVar = (v) this.f9477c;
                r rVar = (r) this.f9478d;
                c0816d2.getClass();
                ArrayList arrayList = new ArrayList();
                String a10 = vVar.a();
                AbstractC2446f abstractC2446f = vVar.f9472a;
                int size = abstractC2446f.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size) {
                        int i19 = i18 + 20;
                        if (i19 > size) {
                            i12 = size;
                        } else {
                            i12 = i19;
                        }
                        ArrayList arrayList2 = new ArrayList(abstractC2446f.subList(i18, i12));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            arrayList3.add(((u) arrayList2.get(i20)).f9470a);
                            i20++;
                            abstractC2446f = abstractC2446f;
                        }
                        AbstractC2446f abstractC2446f2 = abstractC2446f;
                        Bundle bundle4 = new Bundle();
                        bundle4.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle4.putString(str6, c0816d2.f9400b);
                        try {
                            q1 q1Var3 = c0816d2.f9405g;
                            if (true != c0816d2.f9420v) {
                                i14 = 17;
                            } else {
                                i14 = 20;
                            }
                            String packageName3 = c0816d2.f9403e.getPackageName();
                            String str8 = str4;
                            String str9 = c0816d2.f9400b;
                            if (TextUtils.isEmpty(null)) {
                                i15 = size;
                                c0816d2.f9403e.getPackageName();
                            } else {
                                i15 = size;
                            }
                            if (TextUtils.isEmpty(null)) {
                                c0816d2.f9403e.getPackageName();
                            }
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(str6, str9);
                            bundle5.putBoolean(str3, true);
                            String str10 = str3;
                            bundle5.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            String str11 = str6;
                            int i21 = 0;
                            boolean z11 = false;
                            while (i21 < size3) {
                                int i22 = size3;
                                u uVar = (u) arrayList2.get(i21);
                                ArrayList arrayList6 = arrayList2;
                                arrayList4.add(null);
                                z11 |= !TextUtils.isEmpty(null);
                                if (!uVar.f9471b.equals("first_party")) {
                                    i21++;
                                    arrayList2 = arrayList6;
                                    size3 = i22;
                                } else {
                                    throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                }
                            }
                            if (z11) {
                                bundle5.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle5.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            o1 o1Var3 = (o1) q1Var3;
                            Parcel j11 = o1Var3.j();
                            j11.writeInt(i14);
                            j11.writeString(packageName3);
                            j11.writeString(a10);
                            int i23 = s1.f26973a;
                            j11.writeInt(1);
                            bundle4.writeToParcel(j11, 0);
                            j11.writeInt(1);
                            bundle5.writeToParcel(j11, 0);
                            Parcel k12 = o1Var3.k(j11, 901);
                            Bundle bundle6 = (Bundle) s1.a(k12, Bundle.CREATOR);
                            k12.recycle();
                            if (bundle6 == null) {
                                AbstractC2468q.e("BillingClient", "queryProductDetailsAsync got empty product details response.");
                                ((U3.u) c0816d2.f9404f).S(F.b(44, 7, H.f9376y));
                                break;
                            } else if (!bundle6.containsKey("DETAILS_LIST")) {
                                int a11 = AbstractC2468q.a(bundle6, "BillingClient");
                                str4 = AbstractC2468q.c(bundle6, "BillingClient");
                                if (a11 != 0) {
                                    AbstractC2468q.e("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + a11);
                                    ((U3.u) c0816d2.f9404f).S(F.b(23, 7, H.a(a11, str4)));
                                    i11 = a11;
                                } else {
                                    AbstractC2468q.e("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                    ((U3.u) c0816d2.f9404f).S(F.b(45, 7, H.a(6, str4)));
                                    i11 = 6;
                                }
                            } else {
                                ArrayList<String> stringArrayList = bundle6.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    AbstractC2468q.e("BillingClient", "queryProductDetailsAsync got null response list");
                                    ((U3.u) c0816d2.f9404f).S(F.b(46, 7, H.f9376y));
                                    break;
                                } else {
                                    for (int i24 = 0; i24 < stringArrayList.size(); i24++) {
                                        try {
                                            q qVar = new q(stringArrayList.get(i24));
                                            AbstractC2468q.d("BillingClient", "Got product details: ".concat(qVar.toString()));
                                            arrayList.add(qVar);
                                        } catch (JSONException e11) {
                                            AbstractC2468q.f("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e11);
                                            str4 = "Error trying to decode SkuDetails.";
                                            i13 = 6;
                                            ((U3.u) c0816d2.f9404f).S(F.b(47, 7, H.a(6, str4)));
                                            i11 = i13;
                                            rVar.a(H.a(i11, str4), arrayList);
                                            return null;
                                        }
                                    }
                                    abstractC2446f = abstractC2446f2;
                                    str4 = str8;
                                    size = i15;
                                    str3 = str10;
                                    i18 = i19;
                                    str6 = str11;
                                }
                            }
                        } catch (Exception e12) {
                            i13 = 6;
                            AbstractC2468q.f("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
                            ((U3.u) c0816d2.f9404f).S(F.b(43, 7, H.f9359h));
                            str4 = "An internal error occurred.";
                        }
                    } else {
                        i11 = 0;
                    }
                }
                rVar.a(H.a(i11, str4), arrayList);
                return null;
            case 2:
                String str12 = str5;
                C0816d c0816d3 = this.f9476b;
                String str13 = (String) this.f9477c;
                AbstractC2468q.d("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str13)));
                ArrayList arrayList7 = new ArrayList();
                boolean z12 = c0816d3.f9412n;
                String str14 = c0816d3.f9400b;
                Bundle bundle7 = new Bundle();
                bundle7.putString(str6, str14);
                boolean z13 = true;
                if (z12) {
                    bundle7.putBoolean(str3, true);
                }
                String str15 = null;
                while (true) {
                    try {
                        if (c0816d3.f9412n) {
                            q1 q1Var4 = c0816d3.f9405g;
                            if (z13 != c0816d3.f9419u) {
                                i16 = 9;
                            } else {
                                i16 = 19;
                            }
                            String packageName4 = c0816d3.f9403e.getPackageName();
                            o1 o1Var4 = (o1) q1Var4;
                            str2 = str12;
                            Parcel j12 = o1Var4.j();
                            j12.writeInt(i16);
                            j12.writeString(packageName4);
                            j12.writeString(str13);
                            j12.writeString(str15);
                            int i25 = s1.f26973a;
                            j12.writeInt(1);
                            bundle7.writeToParcel(j12, 0);
                            Parcel k13 = o1Var4.k(j12, 11);
                            bundle = (Bundle) s1.a(k13, Bundle.CREATOR);
                            k13.recycle();
                        } else {
                            str2 = str12;
                            q1 q1Var5 = c0816d3.f9405g;
                            String packageName5 = c0816d3.f9403e.getPackageName();
                            o1 o1Var5 = (o1) q1Var5;
                            Parcel j13 = o1Var5.j();
                            j13.writeInt(3);
                            j13.writeString(packageName5);
                            j13.writeString(str13);
                            j13.writeString(str15);
                            Parcel k14 = o1Var5.k(j13, 4);
                            bundle = (Bundle) s1.a(k14, Bundle.CREATOR);
                            k14.recycle();
                        }
                        C4528h D02 = Df.H.D0(bundle, "getPurchase()");
                        C0822j c0822j2 = (C0822j) D02.f38770Z;
                        if (c0822j2 != H.f9360i) {
                            ((U3.u) c0816d3.f9404f).S(F.b(D02.f38769Y, 9, c0822j2));
                            eVar = new U3.e((Object) c0822j2, (Serializable) null);
                        } else {
                            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList4 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            String str16 = str13;
                            int i26 = 0;
                            boolean z14 = false;
                            while (i26 < stringArrayList3.size()) {
                                String str17 = stringArrayList3.get(i26);
                                ArrayList<String> arrayList8 = stringArrayList3;
                                String str18 = stringArrayList4.get(i26);
                                ArrayList<String> arrayList9 = stringArrayList2;
                                Bundle bundle8 = bundle7;
                                AbstractC2468q.d("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i26))));
                                try {
                                    Purchase purchase = new Purchase(str17, str18);
                                    if (TextUtils.isEmpty(purchase.b())) {
                                        AbstractC2468q.e("BillingClient", "BUG: empty/null token!");
                                        z14 = true;
                                    }
                                    arrayList7.add(purchase);
                                    i26++;
                                    bundle7 = bundle8;
                                    stringArrayList3 = arrayList8;
                                    stringArrayList2 = arrayList9;
                                } catch (JSONException e13) {
                                    AbstractC2468q.f("BillingClient", "Got an exception trying to decode the purchase!", e13);
                                    G g11 = c0816d3.f9404f;
                                    C0822j c0822j3 = H.f9359h;
                                    ((U3.u) g11).S(F.b(51, 9, c0822j3));
                                    eVar = new U3.e((Object) c0822j3, (Serializable) null);
                                }
                            }
                            Bundle bundle9 = bundle7;
                            if (z14) {
                                ((U3.u) c0816d3.f9404f).S(F.b(26, 9, H.f9359h));
                            }
                            str15 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            str12 = str2;
                            AbstractC2468q.d("BillingClient", str12.concat(String.valueOf(str15)));
                            if (TextUtils.isEmpty(str15)) {
                                eVar = new U3.e((Object) H.f9360i, (Serializable) arrayList7);
                            } else {
                                str13 = str16;
                                bundle7 = bundle9;
                                z13 = true;
                            }
                        }
                    } catch (Exception e14) {
                        G g12 = c0816d3.f9404f;
                        C0822j c0822j4 = H.f9361j;
                        ((U3.u) g12).S(F.b(52, 9, c0822j4));
                        AbstractC2468q.f("BillingClient", "Got exception trying to get purchasesm try to reconnect", e14);
                        eVar = new U3.e((Object) c0822j4, (Serializable) null);
                    }
                }
                List list = (List) eVar.f17400Y;
                if (list != null) {
                    ((s) this.f9478d).b((C0822j) eVar.f17401Z, list);
                    return null;
                }
                C2442d c2442d = AbstractC2446f.f26919Z;
                ((s) this.f9478d).b((C0822j) eVar.f17401Z, C2454j.f26930j0);
                return null;
            case 3:
                C0816d c0816d4 = this.f9476b;
                String str19 = (String) this.f9477c;
                AbstractC2468q.d("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str19)));
                ArrayList arrayList10 = new ArrayList();
                boolean z15 = c0816d4.f9412n;
                String str20 = c0816d4.f9400b;
                Bundle bundle10 = new Bundle();
                bundle10.putString(str6, str20);
                if (z15) {
                    bundle10.putBoolean(str3, true);
                }
                String str21 = null;
                while (true) {
                    if (!c0816d4.f9410l) {
                        AbstractC2468q.e("BillingClient", "getPurchaseHistory is not supported on current device");
                        c3636c1 = new C3636c1(H.f9365n, (Object) null, 10);
                    } else {
                        try {
                            q1 q1Var6 = c0816d4.f9405g;
                            String packageName6 = c0816d4.f9403e.getPackageName();
                            o1 o1Var6 = (o1) q1Var6;
                            Parcel j14 = o1Var6.j();
                            String str22 = str5;
                            j14.writeInt(6);
                            j14.writeString(packageName6);
                            j14.writeString(str19);
                            j14.writeString(str21);
                            int i27 = s1.f26973a;
                            j14.writeInt(1);
                            bundle10.writeToParcel(j14, 0);
                            Parcel k15 = o1Var6.k(j14, 9);
                            Bundle bundle11 = (Bundle) s1.a(k15, Bundle.CREATOR);
                            k15.recycle();
                            C4528h D03 = Df.H.D0(bundle11, "getPurchaseHistory()");
                            C0822j c0822j5 = (C0822j) D03.f38770Z;
                            if (c0822j5 != H.f9360i) {
                                ((U3.u) c0816d4.f9404f).S(F.b(D03.f38769Y, 11, c0822j5));
                                c3636c1 = new C3636c1(c0822j5, (Object) null, 10);
                            } else {
                                ArrayList<String> stringArrayList5 = bundle11.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList6 = bundle11.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList7 = bundle11.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                String str23 = str19;
                                int i28 = 0;
                                boolean z16 = false;
                                while (i28 < stringArrayList6.size()) {
                                    String str24 = stringArrayList6.get(i28);
                                    Bundle bundle12 = bundle10;
                                    String str25 = stringArrayList7.get(i28);
                                    ArrayList<String> arrayList11 = stringArrayList5;
                                    ArrayList<String> arrayList12 = stringArrayList6;
                                    AbstractC2468q.d("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList5.get(i28))));
                                    try {
                                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str24, str25);
                                        JSONObject jSONObject = purchaseHistoryRecord.f26708c;
                                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                            AbstractC2468q.e("BillingClient", "BUG: empty/null token!");
                                            z16 = true;
                                        }
                                        arrayList10.add(purchaseHistoryRecord);
                                        i28++;
                                        stringArrayList6 = arrayList12;
                                        bundle10 = bundle12;
                                        stringArrayList5 = arrayList11;
                                    } catch (JSONException e15) {
                                        AbstractC2468q.f("BillingClient", "Got an exception trying to decode the purchase!", e15);
                                        G g13 = c0816d4.f9404f;
                                        C0822j c0822j6 = H.f9359h;
                                        ((U3.u) g13).S(F.b(51, 11, c0822j6));
                                        c3636c1 = new C3636c1(c0822j6, (Object) null, 10);
                                    }
                                }
                                Bundle bundle13 = bundle10;
                                if (z16) {
                                    ((U3.u) c0816d4.f9404f).S(F.b(26, 11, H.f9359h));
                                }
                                str21 = bundle11.getString("INAPP_CONTINUATION_TOKEN");
                                AbstractC2468q.d("BillingClient", str22.concat(String.valueOf(str21)));
                                if (TextUtils.isEmpty(str21)) {
                                    c3636c1 = new C3636c1(H.f9360i, arrayList10, 10);
                                } else {
                                    str5 = str22;
                                    str19 = str23;
                                    bundle10 = bundle13;
                                }
                            }
                        } catch (RemoteException e16) {
                            AbstractC2468q.f("BillingClient", "Got exception trying to get purchase history, try to reconnect", e16);
                            G g14 = c0816d4.f9404f;
                            C0822j c0822j7 = H.f9361j;
                            ((U3.u) g14).S(F.b(59, 11, c0822j7));
                            c3636c1 = new C3636c1(c0822j7, (Object) null, 10);
                        }
                    }
                }
                ((com.revenuecat.purchases.google.usecase.d) this.f9478d).a((C0822j) c3636c1.f34286h0, (List) c3636c1.f34285Z);
                return null;
            case 4:
                C0816d c0816d5 = this.f9476b;
                q1 q1Var7 = c0816d5.f9405g;
                String packageName7 = c0816d5.f9403e.getPackageName();
                o1 o1Var7 = (o1) q1Var7;
                Parcel j15 = o1Var7.j();
                j15.writeInt(3);
                j15.writeString(packageName7);
                j15.writeString((String) this.f9477c);
                j15.writeString((String) this.f9478d);
                j15.writeString(null);
                Parcel k16 = o1Var7.k(j15, 3);
                Bundle bundle14 = (Bundle) s1.a(k16, Bundle.CREATOR);
                k16.recycle();
                return bundle14;
            case 5:
                C0816d c0816d6 = this.f9476b;
                C0813a c0813a = (C0813a) this.f9477c;
                com.revenuecat.purchases.google.usecase.a aVar2 = (com.revenuecat.purchases.google.usecase.a) this.f9478d;
                c0816d6.getClass();
                try {
                    q1 q1Var8 = c0816d6.f9405g;
                    String packageName8 = c0816d6.f9403e.getPackageName();
                    String c11 = c0813a.c();
                    String str26 = c0816d6.f9400b;
                    Bundle bundle15 = new Bundle();
                    bundle15.putString(str6, str26);
                    o1 o1Var8 = (o1) q1Var8;
                    Parcel j16 = o1Var8.j();
                    j16.writeInt(9);
                    j16.writeString(packageName8);
                    j16.writeString(c11);
                    int i29 = s1.f26973a;
                    j16.writeInt(1);
                    bundle15.writeToParcel(j16, 0);
                    Parcel k17 = o1Var8.k(j16, 902);
                    Bundle bundle16 = (Bundle) s1.a(k17, Bundle.CREATOR);
                    k17.recycle();
                    aVar2.c(H.a(AbstractC2468q.a(bundle16, "BillingClient"), AbstractC2468q.c(bundle16, "BillingClient")));
                } catch (Exception e17) {
                    AbstractC2468q.f("BillingClient", "Error acknowledge purchase!", e17);
                    G g15 = c0816d6.f9404f;
                    C0822j c0822j8 = H.f9361j;
                    ((U3.u) g15).S(F.b(28, 3, c0822j8));
                    aVar2.c(c0822j8);
                }
                return null;
            default:
                C0816d c0816d7 = this.f9476b;
                Bundle bundle17 = (Bundle) this.f9477c;
                com.revenuecat.purchases.google.usecase.b bVar = (com.revenuecat.purchases.google.usecase.b) this.f9478d;
                c0816d7.getClass();
                try {
                    ((o1) c0816d7.f9405g).h(c0816d7.f9403e.getPackageName(), bundle17, new D(bVar, c0816d7.f9404f));
                } catch (DeadObjectException e18) {
                    AbstractC2468q.f("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e18);
                    G g16 = c0816d7.f9404f;
                    C0822j c0822j9 = H.f9361j;
                    ((U3.u) g16).S(F.b(62, 13, c0822j9));
                    bVar.a(c0822j9, null);
                } catch (Exception e19) {
                    AbstractC2468q.f("BillingClient", "getBillingConfig got an exception.", e19);
                    G g17 = c0816d7.f9404f;
                    C0822j c0822j10 = H.f9359h;
                    ((U3.u) g17).S(F.b(62, 13, c0822j10));
                    bVar.a(c0822j10, null);
                }
                return null;
        }
    }
}
