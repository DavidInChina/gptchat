package o8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import u8.AbstractBinderC5861k;
import u8.AbstractC5854d;
import u8.AbstractC5862l;
import u8.AbstractRunnableC5866p;
import u8.C5852b;
import u8.C5860j;
import u8.C5865o;

/* loaded from: classes.dex */
public final class h extends AbstractRunnableC5866p {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f40947Z = 0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f40948h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f40949i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, N7.f fVar, Context context) {
        super(fVar);
        this.f40949i0 = pVar;
        this.f40948h0 = context;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void b() {
        String str;
        IInterface iInterface;
        int i10 = this.f40947Z;
        int i11 = 0;
        Object obj = this.f40948h0;
        Object obj2 = this.f40949i0;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                N7.f fVar = ((p) obj2).f40973c;
                C5865o c5865o = AbstractC5854d.f46487a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(ILicensingService.SERVICE_PACKAGE, 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && (r4 = signatureArr.length) != 0) {
                            for (Signature signature : signatureArr) {
                                byte[] byteArray = signature.toByteArray();
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                    messageDigest.update(byteArray);
                                    str = Base64.encodeToString(messageDigest.digest(), 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    str = "";
                                }
                                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                                    String str2 = Build.TAGS;
                                    if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                                    }
                                }
                                i11 = packageInfo.versionCode;
                            }
                        } else {
                            Object[] objArr = new Object[0];
                            C5865o c5865o2 = AbstractC5854d.f46487a;
                            c5865o2.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                Log.w("PlayCore", C5865o.c(c5865o2.f46496a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                fVar.b(Integer.valueOf(i11));
                return;
            default:
                x3.r rVar = (x3.r) obj2;
                IBinder iBinder = (IBinder) obj;
                ((g) ((C5852b) rVar.f48717b).f46481i).getClass();
                int i12 = AbstractBinderC5861k.f46495b;
                if (iBinder == null) {
                    iInterface = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    if (queryLocalInterface instanceof AbstractC5862l) {
                        iInterface = (AbstractC5862l) queryLocalInterface;
                    } else {
                        iInterface = new C5860j(iBinder);
                    }
                }
                Object obj3 = rVar.f48717b;
                C5852b c5852b = (C5852b) obj3;
                c5852b.f46486n = iInterface;
                c5852b.f46474b.b("linkToDeath", new Object[0]);
                try {
                    c5852b.f46486n.asBinder().linkToDeath(c5852b.f46483k, 0);
                } catch (RemoteException e10) {
                    c5852b.f46474b.a(e10, "linkToDeath failed", new Object[0]);
                }
                C5852b c5852b2 = (C5852b) obj3;
                c5852b2.f46479g = false;
                Iterator it = c5852b2.f46476d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((C5852b) obj3).f46476d.clear();
                return;
        }
    }

    public h(x3.r rVar, IBinder iBinder) {
        this.f40949i0 = rVar;
        this.f40948h0 = iBinder;
    }
}
