package com.revenuecat.purchases.common;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"j$/util/stream/Stream", "", "stream", "Ljf/y;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FileHelper$removeFirstLinesFromFile$1 extends o implements k {
    final /* synthetic */ int $numberOfLinesToRemove;
    final /* synthetic */ StringBuilder $textToAppend;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "line", "Ljf/y;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StringBuilder sb2) {
            super(1);
            this.$textToAppend = sb2;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y.f36177a;
        }

        public final void invoke(String str) {
            StringBuilder sb2 = this.$textToAppend;
            sb2.append(str);
            sb2.append(Separators.RETURN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileHelper$removeFirstLinesFromFile$1(int i10, StringBuilder sb2) {
        super(1);
        this.$numberOfLinesToRemove = i10;
        this.$textToAppend = sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(k kVar, Object obj) {
        AbstractC3557B.c0("$tmp0", kVar);
        kVar.invoke(obj);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Stream) obj);
        return y.f36177a;
    }

    public final void invoke(Stream<String> stream) {
        AbstractC3557B.c0("stream", stream);
        Stream<String> skip = stream.skip(this.$numberOfLinesToRemove);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$textToAppend);
        skip.forEach(new Consumer() { // from class: com.revenuecat.purchases.common.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileHelper$removeFirstLinesFromFile$1.invoke$lambda$0(k.this, obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
