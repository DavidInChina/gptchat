package C8;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2744Y;

    /* renamed from: Z  reason: collision with root package name */
    public final i f2745Z;

    public /* synthetic */ f(i iVar, int i10) {
        this.f2744Y = i10;
        this.f2745Z = iVar;
    }

    @Override // C8.g
    public final Object e() {
        int i10 = 0;
        int i11 = this.f2744Y;
        i iVar = this.f2745Z;
        Exception exc = null;
        switch (i11) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                while (i10 < 2) {
                    Provider provider = Security.getProvider(strArr[i10]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                    i10++;
                }
                Iterator it = arrayList.iterator();
                Exception exc2 = null;
                while (it.hasNext()) {
                    try {
                        return iVar.f((Provider) it.next());
                    } catch (Exception e10) {
                        if (exc2 == null) {
                            exc2 = e10;
                        }
                    }
                }
                return iVar.f(null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                while (i10 < 3) {
                    Provider provider2 = Security.getProvider(strArr2[i10]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                    i10++;
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        return iVar.f((Provider) it2.next());
                    } catch (Exception e11) {
                        if (exc == null) {
                            exc = e11;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i10, int i11) {
        this(iVar, 0);
        this.f2744Y = i10;
        if (i10 != 1) {
        } else {
            this(iVar, 1);
        }
    }
}
