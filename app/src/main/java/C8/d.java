package C8;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f2735a;

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f2736b;

    /* renamed from: c  reason: collision with root package name */
    public static final long[] f2737c;

    /* renamed from: d  reason: collision with root package name */
    public static final a[][] f2738d;

    /* renamed from: e  reason: collision with root package name */
    public static final a[] f2739e;

    /* renamed from: f  reason: collision with root package name */
    public static final BigInteger f2740f;

    /* renamed from: g  reason: collision with root package name */
    public static final BigInteger f2741g;

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f2742h;

    /* JADX WARN: Type inference failed for: r5v2, types: [U3.e, java.lang.Object] */
    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f2740f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f2741g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f2742h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        ?? obj = new Object();
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        obj.f17401Z = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        int i10 = 0;
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        obj.f17400Y = modPow2;
        f2735a = c.e(c(mod));
        f2736b = c.e(c(mod2));
        f2737c = c.e(c(modPow));
        f2738d = (a[][]) Array.newInstance(a.class, 32, 8);
        U3.e eVar = obj;
        for (int i11 = 0; i11 < 32; i11++) {
            U3.e eVar2 = eVar;
            for (int i12 = 0; i12 < 8; i12++) {
                f2738d[i11][i12] = b(eVar2);
                eVar2 = a(eVar2, eVar);
            }
            for (int i13 = 0; i13 < 8; i13++) {
                eVar = a(eVar, eVar);
            }
        }
        U3.e a5 = a(obj, obj);
        f2739e = new a[8];
        U3.e eVar3 = obj;
        while (i10 < 8) {
            f2739e[i10] = b(eVar3);
            i10++;
            eVar3 = a(eVar3, a5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U3.e, java.lang.Object] */
    public static U3.e a(U3.e eVar, U3.e eVar2) {
        ?? obj = new Object();
        BigInteger multiply = f2741g.multiply(((BigInteger) eVar.f17400Y).multiply((BigInteger) eVar2.f17400Y).multiply((BigInteger) eVar.f17401Z).multiply((BigInteger) eVar2.f17401Z));
        BigInteger bigInteger = f2740f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) eVar.f17400Y).multiply((BigInteger) eVar2.f17401Z).add(((BigInteger) eVar2.f17400Y).multiply((BigInteger) eVar.f17401Z));
        BigInteger bigInteger2 = BigInteger.ONE;
        obj.f17400Y = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        obj.f17401Z = ((BigInteger) eVar.f17401Z).multiply((BigInteger) eVar2.f17401Z).add(((BigInteger) eVar.f17400Y).multiply((BigInteger) eVar2.f17400Y)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return obj;
    }

    public static a b(U3.e eVar) {
        BigInteger add = ((BigInteger) eVar.f17401Z).add((BigInteger) eVar.f17400Y);
        BigInteger bigInteger = f2740f;
        return new a(c.e(c(add.mod(bigInteger))), c.e(c(((BigInteger) eVar.f17401Z).subtract((BigInteger) eVar.f17400Y).mod(bigInteger))), c.e(c(f2742h.multiply((BigInteger) eVar.f17400Y).multiply((BigInteger) eVar.f17401Z).mod(bigInteger))));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
