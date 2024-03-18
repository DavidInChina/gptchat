package qc;

import Qg.F0;
import Qg.s0;
import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchaseResult;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.PurchasesTransactionException;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import kf.w;
import ld.C4429b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pc.AbstractC5126e;
import pc.AbstractC5137p;
import pc.C5125d;
import pc.C5128g;
import pc.C5129h;
import pc.C5130i;
import pc.C5131j;
import pc.C5132k;
import pc.C5134m;
import pc.C5138q;
import pc.C5139s;
import pc.EnumC5127f;
import wd.EnumC6206t;
import wd.p0;
import wd.q0;
import wd.u0;
import x8.W;

/* loaded from: classes2.dex */
public final class i implements AbstractC5126e {

    /* renamed from: a  reason: collision with root package name */
    public final Application f44054a;

    /* renamed from: b  reason: collision with root package name */
    public final d f44055b = new UpdatedCustomerInfoListener() { // from class: qc.d
        @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
        public final void onReceived(CustomerInfo customerInfo) {
            i iVar = i.this;
            AbstractC3557B.c0("this$0", iVar);
            AbstractC3557B.c0("it", customerInfo);
            String appUserID = Purchases.Companion.getSharedInstance().getAppUserID();
            AbstractC3557B.c0("value", appUserID);
            iVar.f44056c.setValue(new C5125d(appUserID, customerInfo.getManagementURL()));
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public final F0 f44056c;

    /* renamed from: d  reason: collision with root package name */
    public final F0 f44057d;

    /* renamed from: e  reason: collision with root package name */
    public Map f44058e;

    /* JADX WARN: Type inference failed for: r1v1, types: [qc.d] */
    public i(Application application, EnumC6206t enumC6206t, C4429b c4429b) {
        this.f44054a = application;
        if (enumC6206t == EnumC6206t.f48459Y) {
            Purchases.Companion.setLogLevel(LogLevel.DEBUG);
        }
        Purchases.Companion.setLogHandler(c.f44042a);
        c4429b.a(new e(this, null));
        F0 c10 = s0.c(new C5125d((String) null, 3));
        this.f44056c = c10;
        this.f44057d = c10;
        this.f44058e = w.f37484Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: PurchasesException -> 0x002b, TryCatch #1 {PurchasesException -> 0x002b, blocks: (B:12:0x0027, B:24:0x0058, B:26:0x0060, B:27:0x0066), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: PurchasesException -> 0x002b, TRY_LEAVE, TryCatch #1 {PurchasesException -> 0x002b, blocks: (B:12:0x0027, B:24:0x0058, B:26:0x0060, B:27:0x0066), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        Object obj;
        i iVar;
        boolean z10;
        EnumC5127f enumC5127f;
        C5129h c5129h;
        C3959i c3959i;
        PurchasesException e10;
        AbstractC5137p U02;
        Offering current;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f44049i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f44049i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = gVar.f44047Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f44049i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        iVar = gVar.f44046Y;
                        try {
                            N.B0(obj2);
                        } catch (PurchasesException e11) {
                            e10 = e11;
                            U02 = L4.a.U0(e10.getError());
                            if (U02 == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    Purchases.Companion companion = Purchases.Companion;
                    if (!companion.isConfigured()) {
                        return new wd.s0(0, C5131j.f43001h0);
                    }
                    try {
                        Purchases sharedInstance = companion.getSharedInstance();
                        gVar.f44046Y = this;
                        gVar.f44049i0 = 1;
                        obj2 = CoroutinesExtensionsCommonKt.awaitOfferings(sharedInstance, gVar);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                        iVar = this;
                    } catch (PurchasesException e12) {
                        e10 = e12;
                        iVar = this;
                        U02 = L4.a.U0(e10.getError());
                        if (U02 == null) {
                            W.G(Pc.e.a(), "Error fetching offerings from RevenueCat", U02, 4);
                            obj = new wd.s0(0, U02);
                            z10 = obj instanceof u0;
                            if (z10) {
                            }
                            if (z10) {
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                }
                current = ((Offerings) obj2).getCurrent();
                if (current == null) {
                    obj = new u0(current);
                } else {
                    obj = new wd.s0(0, C5132k.f43003h0);
                }
                z10 = obj instanceof u0;
                if (z10) {
                    iVar.getClass();
                    List<Package> availablePackages = ((Offering) ((u0) obj).f48468a).getAvailablePackages();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : availablePackages) {
                        String identifier = ((Package) obj3).getIdentifier();
                        Object obj4 = linkedHashMap.get(identifier);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap.put(identifier, obj4);
                        }
                        ((List) obj4).add(obj3);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Package r82 = (Package) t.h2((List) entry.getValue());
                        if (r82 != null) {
                            AbstractC3557B.c0("value", str);
                            c3959i = new C3959i(new C5128g(str), r82);
                        } else {
                            c3959i = null;
                        }
                        if (c3959i != null) {
                            arrayList.add(c3959i);
                        }
                    }
                    iVar.f44058e = AbstractC4268D.k1(arrayList);
                }
                if (z10) {
                    Offering offering = (Offering) ((u0) obj).f48468a;
                    AbstractC3557B.c0("<this>", offering);
                    List<Package> availablePackages2 = offering.getAvailablePackages();
                    ArrayList arrayList2 = new ArrayList();
                    for (Package r62 : availablePackages2) {
                        AbstractC3557B.c0("<this>", r62);
                        PackageType packageType = r62.getPackageType();
                        AbstractC3557B.c0("<this>", packageType);
                        int i12 = AbstractC5302a.f44040a[packageType.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        W.W(Pc.e.a(), "Unsupported RevenueCat package type: " + packageType, null, null, 6);
                                        enumC5127f = null;
                                    } else {
                                        enumC5127f = EnumC5127f.f42982i0;
                                    }
                                } else {
                                    enumC5127f = EnumC5127f.f42981h0;
                                }
                            } else {
                                enumC5127f = EnumC5127f.f42980Z;
                            }
                        } else {
                            enumC5127f = EnumC5127f.f42979Y;
                        }
                        if (enumC5127f == null) {
                            c5129h = null;
                        } else {
                            String identifier2 = r62.getIdentifier();
                            AbstractC3557B.c0("value", identifier2);
                            c5129h = new C5129h(identifier2, enumC5127f, r62.getProduct().getPrice().getFormatted());
                        }
                        if (c5129h != null) {
                            arrayList2.add(c5129h);
                        }
                    }
                    return new u0(arrayList2);
                } else if ((obj instanceof p0) || (obj instanceof q0)) {
                    return obj;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj22 = gVar.f44047Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f44049i0;
        if (i10 == 0) {
        }
        current = ((Offerings) obj22).getCurrent();
        if (current == null) {
        }
        z10 = obj instanceof u0;
        if (z10) {
        }
        if (z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Activity activity, String str, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        i iVar;
        String orderId;
        try {
            if (abstractC4825e instanceof h) {
                hVar = (h) abstractC4825e;
                int i11 = hVar.f44053i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    hVar.f44053i0 = i11 - Integer.MIN_VALUE;
                    Object obj = hVar.f44051Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = hVar.f44053i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            iVar = hVar.f44050Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        Purchases.Companion companion = Purchases.Companion;
                        if (!companion.isConfigured()) {
                            return C5131j.f43001h0;
                        }
                        Package r82 = (Package) this.f44058e.get(new C5128g(str));
                        if (r82 == null) {
                            return C5134m.f43012h0;
                        }
                        PurchaseParams build = new PurchaseParams.Builder(activity, r82).build();
                        Purchases sharedInstance = companion.getSharedInstance();
                        hVar.f44050Y = this;
                        hVar.f44053i0 = 1;
                        obj = CoroutinesExtensionsCommonKt.awaitPurchase(sharedInstance, build, hVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        iVar = this;
                    }
                    PurchaseResult purchaseResult = (PurchaseResult) obj;
                    CustomerInfo customerInfo = purchaseResult.getCustomerInfo();
                    AbstractC3557B.c0("<this>", customerInfo);
                    String appUserID = Purchases.Companion.getSharedInstance().getAppUserID();
                    AbstractC3557B.c0("value", appUserID);
                    C5125d c5125d = new C5125d(appUserID, customerInfo.getManagementURL());
                    iVar.f44056c.setValue(c5125d);
                    StoreTransaction storeTransaction = purchaseResult.getStoreTransaction();
                    AbstractC3557B.c0("<this>", storeTransaction);
                    orderId = storeTransaction.getOrderId();
                    if (orderId != null) {
                        orderId = null;
                    }
                    return new C5138q(new C5139s(orderId), c5125d);
                }
            }
            if (i10 == 0) {
            }
            PurchaseResult purchaseResult2 = (PurchaseResult) obj;
            CustomerInfo customerInfo2 = purchaseResult2.getCustomerInfo();
            AbstractC3557B.c0("<this>", customerInfo2);
            String appUserID2 = Purchases.Companion.getSharedInstance().getAppUserID();
            AbstractC3557B.c0("value", appUserID2);
            C5125d c5125d2 = new C5125d(appUserID2, customerInfo2.getManagementURL());
            iVar.f44056c.setValue(c5125d2);
            StoreTransaction storeTransaction2 = purchaseResult2.getStoreTransaction();
            AbstractC3557B.c0("<this>", storeTransaction2);
            orderId = storeTransaction2.getOrderId();
            if (orderId != null) {
            }
            return new C5138q(new C5139s(orderId), c5125d2);
        } catch (PurchasesTransactionException e10) {
            AbstractC5137p U02 = L4.a.U0(e10.getError());
            if (U02 != null && !e10.getUserCancelled()) {
                W.G(Pc.e.a(), "Error purchasing package from RevenueCat", U02, 4);
                return U02;
            }
            return C5130i.f42996Y;
        }
        hVar = new h(this, abstractC4825e);
        Object obj2 = hVar.f44051Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f44053i0;
    }
}
