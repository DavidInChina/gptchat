package com.revenuecat.purchases.common.networking;

import R4.b;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.NetworkStrings;
import id.AbstractC3557B;
import java.util.Date;
import java.util.Map;
import jf.AbstractC3957g;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.o;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B)\u0012\u0006\u0010:\u001a\u000209\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020302\u0012\b\b\u0002\u00107\u001a\u000206\u00a2\u0006\u0004\b;\u0010<J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018JM\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0000\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000\u00a2\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b)\u0010*J'\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b-\u0010\tJ\u000f\u00101\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108\u00a8\u0006>"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager;", "", "", "path", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "result", "eTag", "Ljf/y;", "storeResult", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "getStoredResultSavedInSharedPreferences", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "resultFromBackend", "", "shouldStoreBackendResult", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)Z", "storedResult", "verificationRequested", "shouldUseETag", "(Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;Z)Z", "refreshETag", "", "getETagHeaders$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;ZZ)Ljava/util/Map;", "getETagHeaders", "", "responseCode", "payload", "eTagHeader", "urlPathWithVersion", "Ljava/util/Date;", "requestDate", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "getHTTPResultFromCacheOrBackend$purchases_customEntitlementComputationRelease", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getHTTPResultFromCacheOrBackend", "shouldUseCachedVersion$purchases_customEntitlementComputationRelease", "(I)Z", "shouldUseCachedVersion", "getStoredResult$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getStoredResult", "eTagInResponse", "storeBackendResultIfNoError$purchases_customEntitlementComputationRelease", "storeBackendResultIfNoError", "clearCaches$purchases_customEntitlementComputationRelease", "()V", "clearCaches", "Ljf/g;", "Landroid/content/SharedPreferences;", "prefs", "Ljf/g;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljf/g;Lcom/revenuecat/purchases/common/DateProvider;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ETagManager {
    public static final Companion Companion = new Companion(null);
    private final DateProvider dateProvider;
    private final AbstractC3957g prefs;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* renamed from: com.revenuecat.purchases.common.networking.ETagManager$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements AbstractC6216a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final SharedPreferences mo122invoke() {
            return ETagManager.Companion.initializeSharedPreferences(this.$context);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager$Companion;", "", "()V", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            AbstractC3557B.c0("context", context);
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            AbstractC3557B.b0("context.getSharedPrefere\u2026DE_PRIVATE,\n            )", sharedPreferences);
            return sharedPreferences;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ETagManager(Context context, AbstractC3957g abstractC3957g, DateProvider dateProvider) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("prefs", abstractC3957g);
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.prefs = abstractC3957g;
        this.dateProvider = dateProvider;
    }

    public static /* synthetic */ Map getETagHeaders$purchases_customEntitlementComputationRelease$default(ETagManager eTagManager, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return eTagManager.getETagHeaders$purchases_customEntitlementComputationRelease(str, z10, z11);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String str) {
        String string = ((SharedPreferences) this.prefs.getValue()).getString(str, null);
        if (string == null) {
            return null;
        }
        return HTTPResultWithETag.Companion.deserialize(string);
    }

    private final boolean shouldStoreBackendResult(HTTPResult hTTPResult) {
        int responseCode = hTTPResult.getResponseCode();
        if (responseCode != 304 && responseCode < 500 && hTTPResult.getVerificationResult() != VerificationResult.FAILED) {
            return true;
        }
        return false;
    }

    private final boolean shouldUseETag(HTTPResultWithETag hTTPResultWithETag, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[hTTPResultWithETag.getHttpResult().getVerificationResult().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new RuntimeException();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    private final synchronized void storeResult(String str, HTTPResult hTTPResult, String str2) {
        ((SharedPreferences) this.prefs.getValue()).edit().putString(str, new HTTPResultWithETag(new ETagData(str2, this.dateProvider.getNow()), HTTPResult.copy$default(hTTPResult, 0, null, HTTPResult.Origin.CACHE, null, null, 27, null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_customEntitlementComputationRelease() {
        ((SharedPreferences) this.prefs.getValue()).edit().clear().apply();
    }

    public final Map<String, String> getETagHeaders$purchases_customEntitlementComputationRelease(String str, boolean z10, boolean z11) {
        HTTPResultWithETag hTTPResultWithETag;
        ETagData eTagData;
        String str2;
        Date lastRefreshTime;
        AbstractC3557B.c0("path", str);
        String str3 = null;
        if (z11) {
            hTTPResultWithETag = null;
        } else {
            hTTPResultWithETag = getStoredResultSavedInSharedPreferences(str);
        }
        if (hTTPResultWithETag == null || (eTagData = hTTPResultWithETag.getETagData()) == null || !shouldUseETag(hTTPResultWithETag, z10)) {
            eTagData = null;
        }
        C3959i[] c3959iArr = new C3959i[2];
        if (eTagData != null) {
            str2 = eTagData.getETag();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        c3959iArr[0] = new C3959i("X-RevenueCat-ETag", str2);
        if (eTagData != null && (lastRefreshTime = eTagData.getLastRefreshTime()) != null) {
            str3 = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        c3959iArr[1] = new C3959i(HTTPRequest.ETAG_LAST_REFRESH_NAME, str3);
        return AbstractC4268D.a1(c3959iArr);
    }

    public final HTTPResult getHTTPResultFromCacheOrBackend$purchases_customEntitlementComputationRelease(int i10, String str, String str2, String str3, boolean z10, Date date, VerificationResult verificationResult) {
        HTTPResult hTTPResult;
        Date date2;
        AbstractC3557B.c0("payload", str);
        AbstractC3557B.c0("urlPathWithVersion", str3);
        AbstractC3557B.c0("verificationResult", verificationResult);
        HTTPResult hTTPResult2 = new HTTPResult(i10, str, HTTPResult.Origin.BACKEND, date, verificationResult);
        if (str2 != null) {
            if (shouldUseCachedVersion$purchases_customEntitlementComputationRelease(i10)) {
                HTTPResult storedResult$purchases_customEntitlementComputationRelease = getStoredResult$purchases_customEntitlementComputationRelease(str3);
                if (storedResult$purchases_customEntitlementComputationRelease != null) {
                    if (date == null) {
                        date2 = storedResult$purchases_customEntitlementComputationRelease.getRequestDate();
                    } else {
                        date2 = date;
                    }
                    hTTPResult = HTTPResult.copy$default(storedResult$purchases_customEntitlementComputationRelease, 0, null, null, date2, verificationResult, 7, null);
                } else {
                    hTTPResult = null;
                }
                if (hTTPResult == null) {
                    if (!z10) {
                        return null;
                    }
                    AbstractC2469q0.t(new Object[]{hTTPResult2}, 1, NetworkStrings.ETAG_CALL_ALREADY_RETRIED, LogIntent.WARNING);
                    return hTTPResult2;
                }
                return hTTPResult;
            }
            storeBackendResultIfNoError$purchases_customEntitlementComputationRelease(str3, hTTPResult2, str2);
        }
        return hTTPResult2;
    }

    public final HTTPResult getStoredResult$purchases_customEntitlementComputationRelease(String str) {
        AbstractC3557B.c0("path", str);
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$purchases_customEntitlementComputationRelease(int i10) {
        return i10 == 304;
    }

    public final void storeBackendResultIfNoError$purchases_customEntitlementComputationRelease(String str, HTTPResult hTTPResult, String str2) {
        AbstractC3557B.c0("path", str);
        AbstractC3557B.c0("resultFromBackend", hTTPResult);
        AbstractC3557B.c0("eTagInResponse", str2);
        if (shouldStoreBackendResult(hTTPResult)) {
            storeResult(str, hTTPResult, str2);
        }
    }

    public /* synthetic */ ETagManager(Context context, AbstractC3957g abstractC3957g, DateProvider dateProvider, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? b.D1(new AnonymousClass1(context)) : abstractC3957g, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
