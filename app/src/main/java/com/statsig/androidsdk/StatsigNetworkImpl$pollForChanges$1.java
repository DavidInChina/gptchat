package com.statsig.androidsdk;

import Ad.l;
import Ng.B;
import Qg.AbstractC1207j;
import R4.b;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQg/j;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "Ljf/y;", "<anonymous>", "(LQg/j;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1", f = "StatsigNetwork.kt", l = {236, 495, 245}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigNetworkImpl$pollForChanges$1 extends AbstractC5163j implements n {
    final /* synthetic */ String $api;
    final /* synthetic */ StatsigMetadata $metadata;
    final /* synthetic */ Long $sinceTime;
    final /* synthetic */ StatsigUser $user;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$pollForChanges$1(StatsigUser statsigUser, StatsigMetadata statsigMetadata, Long l10, StatsigNetworkImpl statsigNetworkImpl, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.$user = statsigUser;
        this.$metadata = statsigMetadata;
        this.$sinceTime = l10;
        this.this$0 = statsigNetworkImpl;
        this.$api = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        StatsigNetworkImpl$pollForChanges$1 statsigNetworkImpl$pollForChanges$1 = new StatsigNetworkImpl$pollForChanges$1(this.$user, this.$metadata, this.$sinceTime, this.this$0, this.$api, abstractC4825e);
        statsigNetworkImpl$pollForChanges$1.L$0 = obj;
        return statsigNetworkImpl$pollForChanges$1;
    }

    public final Object invoke(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        return ((StatsigNetworkImpl$pollForChanges$1) create(abstractC1207j, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:24|25|26|27|43|28|(1:30)(10:31|45|32|33|34|(1:36)|37|38|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
        r3 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0133 -> B:38:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013e -> B:9:0x0021). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0021 -> B:9:0x0021). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC1207j abstractC1207j;
        StatsigUser statsigUser;
        StatsigMetadata statsigMetadata;
        AbstractC1207j abstractC1207j2;
        Object obj2;
        AbstractC1207j abstractC1207j3;
        StatsigUser statsigUser2;
        StatsigMetadata statsigMetadata2;
        StatsigMetadata statsigMetadata3;
        AbstractC1207j abstractC1207j4;
        I8.n nVar;
        int i10 = 1;
        char c10 = 3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        statsigMetadata2 = (StatsigMetadata) this.L$2;
                        statsigUser2 = (StatsigUser) this.L$1;
                        abstractC1207j3 = (AbstractC1207j) this.L$0;
                        try {
                            N.B0(obj);
                        } catch (Exception unused) {
                        }
                        AbstractC1207j abstractC1207j5 = abstractC1207j3;
                        statsigMetadata3 = statsigMetadata2;
                        abstractC1207j4 = abstractC1207j5;
                        i10 = 1;
                        this.L$0 = abstractC1207j4;
                        this.L$1 = statsigUser2;
                        this.L$2 = statsigMetadata3;
                        this.L$3 = null;
                        this.label = i10;
                        if (b.p0(10000L, this) != enumC5000a) {
                            return enumC5000a;
                        }
                        StatsigMetadata statsigMetadata4 = statsigMetadata3;
                        abstractC1207j3 = abstractC1207j4;
                        statsigMetadata2 = statsigMetadata4;
                        C3959i c3959i = new C3959i("user", statsigUser2);
                        C3959i c3959i2 = new C3959i("statsigMetadata", statsigMetadata2);
                        Long l10 = this.$sinceTime;
                        C3959i c3959i3 = new C3959i("lastSyncTimeForUser", l10);
                        C3959i c3959i4 = new C3959i("sinceTime", l10);
                        C3959i c3959i5 = new C3959i("hash", HashAlgorithm.DJB2.getValue());
                        C3959i[] c3959iArr = new C3959i[5];
                        c3959iArr[0] = c3959i;
                        c3959iArr[i10] = c3959i2;
                        c3959iArr[2] = c3959i3;
                        c3959iArr[c10] = c3959i4;
                        c3959iArr[4] = c3959i5;
                        Map a12 = AbstractC4268D.a1(c3959iArr);
                        StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                        String str = this.$api;
                        nVar = statsigNetworkImpl.gson;
                        String i12 = nVar.i(a12);
                        AbstractC3557B.b0("gson.toJson(body)", i12);
                        ContextType contextType = ContextType.CONFIG_SYNC;
                        B io2 = statsigNetworkImpl.dispatcherProvider.getIo();
                        StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 = new StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1(str, "initialize", null, statsigNetworkImpl, null, null, contextType, 0, i12, null);
                        this.L$0 = abstractC1207j3;
                        this.L$1 = statsigUser2;
                        this.L$2 = statsigMetadata2;
                        this.L$3 = abstractC1207j3;
                        this.label = 2;
                        obj2 = l.n1(this, io2, statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1);
                        if (obj2 != enumC5000a) {
                            return enumC5000a;
                        }
                        abstractC1207j = abstractC1207j3;
                        statsigUser = statsigUser2;
                        statsigMetadata = statsigMetadata2;
                        abstractC1207j2 = abstractC1207j;
                        try {
                        } catch (Exception unused2) {
                            c10 = 3;
                        }
                        this.L$0 = abstractC1207j;
                        this.L$1 = statsigUser;
                        this.L$2 = statsigMetadata;
                        this.L$3 = null;
                        c10 = 3;
                        this.label = 3;
                        if (abstractC1207j2.c(obj2, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        abstractC1207j4 = abstractC1207j;
                        StatsigUser statsigUser3 = statsigUser;
                        statsigMetadata3 = statsigMetadata;
                        statsigUser2 = statsigUser3;
                        i10 = 1;
                        this.L$0 = abstractC1207j4;
                        this.L$1 = statsigUser2;
                        this.L$2 = statsigMetadata3;
                        this.L$3 = null;
                        this.label = i10;
                        if (b.p0(10000L, this) != enumC5000a) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    abstractC1207j2 = (AbstractC1207j) this.L$3;
                    statsigMetadata = (StatsigMetadata) this.L$2;
                    statsigUser = (StatsigUser) this.L$1;
                    abstractC1207j = (AbstractC1207j) this.L$0;
                    try {
                        N.B0(obj);
                        obj2 = obj;
                    } catch (Exception unused3) {
                    }
                    this.L$0 = abstractC1207j;
                    this.L$1 = statsigUser;
                    this.L$2 = statsigMetadata;
                    this.L$3 = null;
                    c10 = 3;
                    this.label = 3;
                    if (abstractC1207j2.c(obj2, this) == enumC5000a) {
                    }
                    abstractC1207j4 = abstractC1207j;
                    StatsigUser statsigUser32 = statsigUser;
                    statsigMetadata3 = statsigMetadata;
                    statsigUser2 = statsigUser32;
                    i10 = 1;
                    this.L$0 = abstractC1207j4;
                    this.L$1 = statsigUser2;
                    this.L$2 = statsigMetadata3;
                    this.L$3 = null;
                    this.label = i10;
                    if (b.p0(10000L, this) != enumC5000a) {
                    }
                }
            } else {
                statsigMetadata2 = (StatsigMetadata) this.L$2;
                statsigUser2 = (StatsigUser) this.L$1;
                abstractC1207j3 = (AbstractC1207j) this.L$0;
                N.B0(obj);
                C3959i c3959i6 = new C3959i("user", statsigUser2);
                C3959i c3959i22 = new C3959i("statsigMetadata", statsigMetadata2);
                Long l102 = this.$sinceTime;
                C3959i c3959i32 = new C3959i("lastSyncTimeForUser", l102);
                C3959i c3959i42 = new C3959i("sinceTime", l102);
                C3959i c3959i52 = new C3959i("hash", HashAlgorithm.DJB2.getValue());
                C3959i[] c3959iArr2 = new C3959i[5];
                c3959iArr2[0] = c3959i6;
                c3959iArr2[i10] = c3959i22;
                c3959iArr2[2] = c3959i32;
                c3959iArr2[c10] = c3959i42;
                c3959iArr2[4] = c3959i52;
                Map a122 = AbstractC4268D.a1(c3959iArr2);
                StatsigNetworkImpl statsigNetworkImpl2 = this.this$0;
                String str2 = this.$api;
                nVar = statsigNetworkImpl2.gson;
                String i122 = nVar.i(a122);
                AbstractC3557B.b0("gson.toJson(body)", i122);
                ContextType contextType2 = ContextType.CONFIG_SYNC;
                B io22 = statsigNetworkImpl2.dispatcherProvider.getIo();
                StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$12 = new StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1(str2, "initialize", null, statsigNetworkImpl2, null, null, contextType2, 0, i122, null);
                this.L$0 = abstractC1207j3;
                this.L$1 = statsigUser2;
                this.L$2 = statsigMetadata2;
                this.L$3 = abstractC1207j3;
                this.label = 2;
                obj2 = l.n1(this, io22, statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$12);
                if (obj2 != enumC5000a) {
                }
            }
        } else {
            N.B0(obj);
            abstractC1207j4 = (AbstractC1207j) this.L$0;
            StatsigUser statsigUser4 = this.$user;
            if (statsigUser4 == null) {
                statsigUser2 = null;
            } else {
                statsigUser2 = statsigUser4.getCopyForEvaluation$build_release();
            }
            statsigMetadata3 = r8.copy((r24 & 1) != 0 ? r8.stableID : null, (r24 & 2) != 0 ? r8.appIdentifier : null, (r24 & 4) != 0 ? r8.appVersion : null, (r24 & 8) != 0 ? r8.deviceModel : null, (r24 & 16) != 0 ? r8.deviceOS : null, (r24 & 32) != 0 ? r8.language : null, (r24 & 64) != 0 ? r8.sdkType : null, (r24 & 128) != 0 ? r8.sdkVersion : null, (r24 & 256) != 0 ? r8.sessionID : null, (r24 & 512) != 0 ? r8.systemVersion : null, (r24 & 1024) != 0 ? this.$metadata.systemName : null);
            this.L$0 = abstractC1207j4;
            this.L$1 = statsigUser2;
            this.L$2 = statsigMetadata3;
            this.L$3 = null;
            this.label = i10;
            if (b.p0(10000L, this) != enumC5000a) {
            }
        }
    }
}
