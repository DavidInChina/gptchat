package com.revenuecat.purchases.common.verification;

import android.gov.nist.core.a;
import android.util.Base64;
import id.AbstractC3557B;
import java.util.Arrays;
import kf.q;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature;", "", "intermediateKey", "", "intermediateKeyExpiration", "intermediateKeySignature", "salt", "payload", "([B[B[B[B[B)V", "getIntermediateKey", "()[B", "getIntermediateKeyExpiration", "getIntermediateKeySignature", "getPayload", "getSalt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Component", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class Signature {
    public static final Companion Companion = new Companion(null);
    private final byte[] intermediateKey;
    private final byte[] intermediateKeyExpiration;
    private final byte[] intermediateKeySignature;
    private final byte[] payload;
    private final byte[] salt;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature$Companion;", "", "()V", "fromString", "Lcom/revenuecat/purchases/common/verification/Signature;", "signature", "", "fromString$purchases_customEntitlementComputationRelease", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Signature fromString$purchases_customEntitlementComputationRelease(String str) {
            byte[] copyOf;
            byte[] copyOf2;
            byte[] copyOf3;
            byte[] copyOf4;
            byte[] copyOf5;
            AbstractC3557B.c0("signature", str);
            byte[] decode = Base64.decode(str, 0);
            int totalSize = Component.Companion.getTotalSize();
            if (decode.length == totalSize) {
                copyOf = SignatureKt.copyOf(decode, Component.INTERMEDIATE_KEY);
                copyOf2 = SignatureKt.copyOf(decode, Component.INTERMEDIATE_KEY_EXPIRATION);
                copyOf3 = SignatureKt.copyOf(decode, Component.INTERMEDIATE_KEY_SIGNATURE);
                copyOf4 = SignatureKt.copyOf(decode, Component.SALT);
                copyOf5 = SignatureKt.copyOf(decode, Component.PAYLOAD);
                return new Signature(copyOf, copyOf2, copyOf3, copyOf4, copyOf5);
            }
            throw new InvalidSignatureSizeException(a.l(a.q("Invalid signature size. Expected ", totalSize, ", got "), decode.length, " bytes"));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature$Component;", "", "size", "", "(Ljava/lang/String;II)V", "endByte", "getEndByte", "()I", "getSize", "startByte", "getStartByte", "INTERMEDIATE_KEY", "INTERMEDIATE_KEY_EXPIRATION", "INTERMEDIATE_KEY_SIGNATURE", "SALT", "PAYLOAD", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public enum Component {
        INTERMEDIATE_KEY(32),
        INTERMEDIATE_KEY_EXPIRATION(4),
        INTERMEDIATE_KEY_SIGNATURE(64),
        SALT(16),
        PAYLOAD(64);
        
        public static final Companion Companion = new Companion(null);
        private final int size;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature$Component$Companion;", "", "()V", "totalSize", "", "getTotalSize", "()I", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final int getTotalSize() {
                int i10 = 0;
                for (Component component : Component.values()) {
                    i10 += component.getSize();
                }
                return i10;
            }
        }

        Component(int i10) {
            this.size = i10;
        }

        public final int getEndByte() {
            return getStartByte() + this.size;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartByte() {
            int i10 = 0;
            for (Object obj : q.c3(0, ordinal(), values())) {
                i10 += ((Component) obj).size;
            }
            return i10;
        }
    }

    public Signature(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC3557B.c0("intermediateKey", bArr);
        AbstractC3557B.c0("intermediateKeyExpiration", bArr2);
        AbstractC3557B.c0("intermediateKeySignature", bArr3);
        AbstractC3557B.c0("salt", bArr4);
        AbstractC3557B.c0("payload", bArr5);
        this.intermediateKey = bArr;
        this.intermediateKeyExpiration = bArr2;
        this.intermediateKeySignature = bArr3;
        this.salt = bArr4;
        this.payload = bArr5;
    }

    public static /* synthetic */ Signature copy$default(Signature signature, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = signature.intermediateKey;
        }
        if ((i10 & 2) != 0) {
            bArr2 = signature.intermediateKeyExpiration;
        }
        byte[] bArr6 = bArr2;
        if ((i10 & 4) != 0) {
            bArr3 = signature.intermediateKeySignature;
        }
        byte[] bArr7 = bArr3;
        if ((i10 & 8) != 0) {
            bArr4 = signature.salt;
        }
        byte[] bArr8 = bArr4;
        if ((i10 & 16) != 0) {
            bArr5 = signature.payload;
        }
        return signature.copy(bArr, bArr6, bArr7, bArr8, bArr5);
    }

    public final byte[] component1() {
        return this.intermediateKey;
    }

    public final byte[] component2() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] component3() {
        return this.intermediateKeySignature;
    }

    public final byte[] component4() {
        return this.salt;
    }

    public final byte[] component5() {
        return this.payload;
    }

    public final Signature copy(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC3557B.c0("intermediateKey", bArr);
        AbstractC3557B.c0("intermediateKeyExpiration", bArr2);
        AbstractC3557B.c0("intermediateKeySignature", bArr3);
        AbstractC3557B.c0("salt", bArr4);
        AbstractC3557B.c0("payload", bArr5);
        return new Signature(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(Signature.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.common.verification.Signature", obj);
        Signature signature = (Signature) obj;
        if (Arrays.equals(this.intermediateKey, signature.intermediateKey) && Arrays.equals(this.intermediateKeyExpiration, signature.intermediateKeyExpiration) && Arrays.equals(this.intermediateKeySignature, signature.intermediateKeySignature) && Arrays.equals(this.salt, signature.salt) && Arrays.equals(this.payload, signature.payload)) {
            return true;
        }
        return false;
    }

    public final byte[] getIntermediateKey() {
        return this.intermediateKey;
    }

    public final byte[] getIntermediateKeyExpiration() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] getIntermediateKeySignature() {
        return this.intermediateKeySignature;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.intermediateKeyExpiration);
        int hashCode2 = Arrays.hashCode(this.intermediateKeySignature);
        int hashCode3 = Arrays.hashCode(this.salt);
        return Arrays.hashCode(this.payload) + ((hashCode3 + ((hashCode2 + ((hashCode + (Arrays.hashCode(this.intermediateKey) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Signature(intermediateKey=" + Arrays.toString(this.intermediateKey) + ", intermediateKeyExpiration=" + Arrays.toString(this.intermediateKeyExpiration) + ", intermediateKeySignature=" + Arrays.toString(this.intermediateKeySignature) + ", salt=" + Arrays.toString(this.salt) + ", payload=" + Arrays.toString(this.payload) + ')';
    }
}
